(function() {
  function embed () {
    var evt = new Event('codefund');
    var uplift = {};

    function trackUplift() {
      try {
        var url = 'https://codefund.io/impressions/c52d895b-2617-49ee-a633-a6957c7b33be/uplift?advertiser_id=239';
        console.log('CodeFund is recording uplift. ' + url);
        var xhr = new XMLHttpRequest();
        xhr.open('POST', url);
        xhr.send();
      } catch (e) {
        console.log('CodeFund was unable to record uplift! ' + e.message);
      }
    };

    function verifyUplift() {
      if (uplift.pixel1 === undefined || uplift.pixel2 === undefined) { return; }
      if (uplift.pixel1 && !uplift.pixel2) { trackUplift(); }
    }

    function detectUplift(count) {
      var url = 'https://cdn2.codefund.app/assets/px.js';
      if (url.length === 0) { return; }
      var xhr = new XMLHttpRequest();
      xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
          if (xhr.status >= 200 && xhr.status < 300) {
            if (count === 1) { detectUplift(2); }
            uplift['pixel' + count] = true;
          } else {
            uplift['pixel' + count] = false;
          }
          verifyUplift();
        }
      };
      xhr.open('GET', url + '?ch=' + count + '&rnd=' + Math.random() * 11);
      xhr.send();
    }

    function elementVisible(element) {
      if (!element) { return false; }

      while (element) {
        var style = getComputedStyle(element);
        if (style.visibility === 'hidden' || style.display === 'none') { return false; }
        element = element.parentElement;
      }

      return true;
    }

    function closeCodeFund() {
      var codeFundElement = document.getElementById('codefund') || document.getElementById('codefund_ad');
      codeFundElement.remove();
      sessionStorage.setItem('codefund', 'closed');
    }

    try {
      if (sessionStorage.getItem('codefund') === 'closed') { return; }

      var codeFundElement = document.getElementById('codefund') || document.getElementById('codefund_ad');
      if (!elementVisible(codeFundElement)) {
        console.log('CodeFund element not visible! Please verify an element exists with id="codefund" and that it is visible.');
        return;
      }

      codeFundElement.innerHTML = '<div id="cf" style="max-width: 330px; background-color: rgba(0, 0, 0, 0.05); margin: 0 auto; border: none;"> <span> <span class="cf-wrapper" style="border-radius: 0; display: block; overflow: hidden; font-size: 12px; line-height: 1.4; text-align: left; font-family: Helvetica; padding: 14px 10px;"> <a data-href="campaign_url" target="_blank" rel="nofollow noopener" style="box-shadow: none !important; text-decoration: none;"> <span class="cf-img-wrapper" style="float: left; margin-right: 15px;"> <img border="0" height="100" width="100" class="cf-img" alt="Segment V2" src="https://cdn2.codefund.app/EhD89y8kRJsDyjCjbFYticYC" style="vertical-align: middle; max-width: 130px; position: relative; border: none;"> </span> <span class="cf-text" style="color: rgba(0, 0, 0, 0.8);"> <strong>Segment</strong> <span>Send data to any tool without having to implement a new API every time.</span> </span> </a> <a href="https://codefund.io" data-target="powered_by_url" class="cf-powered-by" target="_blank" rel="nofollow noopener" style="box-shadow: none !important; text-decoration: none; margin-top: 5px; font-size: 11px; display: block; color: #777;"> ads served ethically <img data-src="impression_url" alt=""> </a> </span> </span> </div>';
      codeFundElement.querySelector('img[data-src="impression_url"]').src = 'https://codefund.io/display/c52d895b-2617-49ee-a633-a6957c7b33be.gif';
      codeFundElement.querySelectorAll('a[data-href="campaign_url"]').forEach(function (a) { a.href = 'https://codefund.io/impressions/c52d895b-2617-49ee-a633-a6957c7b33be/click?campaign_id=579&creative_id=300&property_id=457&template=rectangle-narrow&theme=light'; });

      var poweredByElement = codeFundElement.querySelector('a[data-target="powered_by_url"]');
      if (poweredByElement) { poweredByElement.href = 'https://codefund.io/invite/ZsbJFtc9eKM'; }

      var closeElement = codeFundElement.querySelector('button[data-behavior="close"]');
      if (closeElement) { closeElement.addEventListener('click', closeCodeFund); }

      evt.detail = { status: 'ok', house: false };
      detectUplift(1);
    } catch (e) {
      console.log('CodeFund detected an error! Please verify an element exists with id="codefund". ' + e.message);
      evt.detail = { status: 'error', message: e.message };
    }
    document.removeEventListener('DOMContentLoaded', embed);
    window.dispatchEvent(evt);
  };
  (document.readyState === 'loading') ? document.addEventListener('DOMContentLoaded', embed) : embed();
})();
