var refEn=0,tagsInitDone=0,gptAdSlots=[],adDomain="www.onlinegdb.com",breakpoints={desktop:"1024",tablet:"768",mobile:"0"},domainValid=1,PREBID_TIMEOUT=1500,interstitialDone=0,waldoTimeOuts=[],waldoAdRefreshes=[],allAdUnits=[],blockAdsOn=[],pubwiseSiteId="",adTagsInitFlag=0,siteId=5831,bidDivAvailable=0,waldoTagsStatus=[],googletag=googletag||{},pbjs=pbjs||{},switchUserSync=0,waldoRestrictIp=0,waldoImpressionDone=0,blockedPageAds="",waldoGDPR=1,waldoCountry=waldoReadCookie("waldo_country"),waldoContinent=waldoReadCookie("waldo_continent"),waldoDataPointsDone=waldoReadCookie("waldo_data_points_done");function adDomainCheck(){if(blockAdsOn.length){var e=window.location.pathname;for(i=0;i<blockAdsOn.length;i++)if(blockAdsOn[i]==e)return!1}var t=window.location.href;t=decodeURI(t),t=decodeURIComponent(t);var a=/(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))/.exec(t);return null===a||-1!==a[0].indexOf("volkmarkt.com")||(waldoEmailDetected(t),!1)}function waldoInitScripts(){var e=document.createElement("style");e.type="text/css";var t="";t+=".waldo-sticky-footer{position: fixed; width: 100%; bottom: 0px; left: 0px; text-align: center; z-index: 9000;}",t+=".waldo-sticky-footer iframe, .waldo-sticky-footer div {margin-left: auto;margin-right: auto;}",t+=".waldo-sticky-sidebar{position: fixed; top: 10px;z-index: 90}",t+=".waldo-sticky-css{position: sticky; top: 10px; z-index: 90}",t+=".waldo-overlay{position: fixed;height: 100%;width: 100%;top: 0;left: 0;z-index: 105;background: rgba(0,0,0,0.7);}",t+="#waldo-counter {position: absolute;bottom: 0;right: 0;color: #fff;font-size: 30px;padding: 15px;}",browserWidth>=breakpoints.desktop&&(t+=".waldo-bfleft {position: fixed; left: 0; top: 10px;z-index:101;}",t+=".waldo-bfright {position: fixed; right: 0; top: 10px;z-index:101;}"),t+='div[class^="app_gdpr-"] a {color: #41afbb !important; text-decoration: underline !important}',t+="#waldo-close-button a {",t+="border: 1px solid rgba(0,0,0,.35);",t+="padding: 3px;",t+="font-size: 12px;",t+="color: #fff;",t+="font-weight: bold;",t+="background-color: #777;",t+="}",e.appendChild(document.createTextNode(t)),document.getElementsByTagName("head")[0].appendChild(e);var a=document.createElement("script");a.async=!0,a.type="text/javascript";var o="https:"==document.location.protocol;a.src=(o?"https:":"http:")+"//www.googletagservices.com/tag/js/gpt.js";var s=document.getElementsByTagName("script")[0];s.parentNode.insertBefore(a,s);var i=document.createElement("script");i.type="text/javascript",i.text="googletag.cmd.push(function() {",i.text+="gptAdSlots[5832] = googletag.defineSlot('/124067137/onlinegdb728x90FS_1', [[728, 90], [320, 50]], 'waldo-tag-5832').defineSizeMapping(googletag.sizeMapping().addSize([1024, 0], [[728, 90]]).addSize([768, 0], [[320, 50]]).addSize([0, 0], [[320, 50]]).build()).addService(googletag.pubads());",i.text+="gptAdSlots[5833] = googletag.defineSlot('/8491498/onlinegdb728x90FS_1_Universal_Passback_5d979d3661118', [[728, 90], [320, 50]], 'waldo-tag-5833').defineSizeMapping(googletag.sizeMapping().addSize([1024, 0], [[728, 90]]).addSize([768, 0], [[320, 50]]).addSize([0, 0], [[320, 50]]).build()).addService(googletag.pubads());",i.text+="googletag.pubads().enableSingleRequest();",i.text+="googletag.enableServices();",i.text+="googletag.pubads().addEventListener('impressionViewable', function(event) {hb_refresh(event); hb_sroll_pause(event);});",i.text+="googletag.pubads().addEventListener('slotRenderEnded', function(event) {waldoAddCloseBtn(event); waldoPassbackInit(event);waldoInterstitialInit(event);})",i.text+="});",document.getElementsByTagName("head")[0].appendChild(i);var n=document.createElement("script");n.type="text/javascript",n.async=!0,n.src="https://cdn.thisiswaldo.com/sites/all/modules/custom/ad_delivery/prebid.js";var d=document.getElementsByTagName("head")[0];d.insertBefore(n,d.firstChild)}Array.prototype.find||Object.defineProperty(Array.prototype,"find",{value:function(e){if(null==this)throw new TypeError('"this" is null or not defined');var t=Object(this),a=t.length>>>0;if("function"!=typeof e)throw new TypeError("predicate must be a function");for(var o=arguments[1],s=0;s<a;){var i=t[s];if(e.call(o,i,s,t))return i;s++}},configurable:!0,writable:!0}),null===waldoCountry&&(PREBID_TIMEOUT+=500);var affiliateBanners,browserWidth=Math.max(document.documentElement.clientWidth,window.innerWidth||0),adUnits=[{code:"waldo-tag-5832",mediaTypes:{banner:{sizes:[]}},customParams:{slotNo:"5832",amp_code:"/124067137/onlinegdb728x90FS_1",mobile_pause:"0",refresh:{type:"min_max",desktop:{min:"45",max:"90"},mobile:{min:"30",max:"45"},min:"45",max:"90",limit:"0"},passback:"5833",passback_refresh:"0",mobile_refresh:1},sizeMapping:[{minWidth:"1024",sizes:[[728,90]],bids:[{bidder:"appnexus",params:{placementId:"17239726"}},{bidder:"triplelift",params:{inventoryCode:"NM_RON_HDX"}},{bidder:"aardvark",params:{ai:"w2tW",sc:"cidX"}},{bidder:"rubicon",params:{accountId:"17822",zoneId:"1453120",siteId:"288452"}}]},{minWidth:"768",sizes:[[320,50]],bids:[{bidder:"appnexus",params:{placementId:"17239726"}},{bidder:"triplelift",params:{inventoryCode:"NM_RON_HDX"}},{bidder:"aardvark",params:{ai:"w2tW",sc:"752g"}},{bidder:"rubicon",params:{accountId:"17822",zoneId:"1453120",siteId:"288452"}}]},{minWidth:"0",sizes:[[320,50]],bids:[{bidder:"appnexus",params:{placementId:"17239726"}},{bidder:"triplelift",params:{inventoryCode:"NM_RON_HDX"}},{bidder:"aardvark",params:{ai:"w2tW",sc:"752g"}},{bidder:"rubicon",params:{accountId:"17822",zoneId:"1453120",siteId:"288452"}}]}],affiliate_banners:[]}],passbackAdUnits=[{code:"waldo-tag-5833",customParams:{slotNo:"5833",amp_code:"/124067137/onlinegdb728x90FS_1",mobile_pause:"0",refresh:{type:"min_max",desktop:{min:"45",max:"90"},mobile:{min:"30",max:"45"},min:"45",max:"90",limit:"0"},passback_refresh:"0",mobile_refresh:1}}];if(allAdUnits=adUnits.concat(passbackAdUnits),adUnits.forEach(function(e){if(!e.bids){var t=e.sizeMapping.find(function(e){return browserWidth>0?browserWidth>=e.minWidth:0==e.minWidth}).bids,a=e.sizeMapping.find(function(e){return browserWidth>0?browserWidth>=e.minWidth:0==e.minWidth}).sizes;e.mediaTypes.banner.sizes=a,e.bids=t,delete e.sizeMapping}}),googletag.cmd=googletag.cmd||[],googletag.cmd.push(function(){googletag.pubads().disableInitialLoad()}),adDomainCheck()){function fetchHeaderBids(){var e=["prebid"],t={adserverRequestSent:!1};function a(a){!0!==t.adserverRequestSent&&("a9"===a?t.a9=!0:"prebid"===a&&(t.prebid=!0),e.map(function(e){return t[e]}).filter(Boolean).length===e.length&&o())}function o(){!0!==t.adserverRequestSent&&(t.adserverRequestSent=!0,pbjs.adserverRequestSent=!0,t.sendAdserverRequest=!0,googletag.cmd.push(function(){pbjs.setTargetingForGPTAsync(),googletag.pubads().refresh()}))}e.forEach(function(e){t[e]=!1}),pbjs.que.push(function(){"EU"!=waldoReadCookie("waldo_continent")&&"RO"!=waldoReadCookie("waldo_country")||pbjs.setConfig({consentManagement:{cmpApi:"iab",timeout:2e3,allowAuctionWithoutConsent:!0}}),pbjs.addAdUnits(adUnits),pbjs.setConfig({userSync:{filterSettings:{all:{bidders:["aardvark"],filter:"include"}}}}),pbjs.requestBids({bidsBackHandler:function(e){a("prebid")}})}),setTimeout(function(){o()},3e3)}function waldoInitCmp(){var e=waldoReadCookie("waldo_continent"),t=waldoReadCookie("euconsent");if("EU"==e&&null===t){var a=document.createElement("script");a.type="text/javascript",a.src="//thisiswaldo.com/sites/all/modules/custom/ad_delivery/cmp/build/cmp.complete.bundle.js";var o=document.getElementsByTagName("head")[0];o.insertBefore(a,o.firstChild)}}function hb_sroll_pause(e){for(var t=0,a=allAdUnits.length;t<a;t++)e.slot.getSlotElementId()==allAdUnits[t].code&&allAdUnits[t].customParams.mobile_pause>0&&browserWidth<breakpoints.tablet&&(document.documentElement.style.overflow="hidden",document.body.style.overflow="hidden",function(e){setTimeout(function(){document.documentElement.style.overflow="",document.body.style.overflow=""},1e3*allAdUnits[e].customParams.mobile_pause)}(t))}function hb_refresh(e){if(!refEn)return!1;for(var t=0,a=adUnits.length;t<a;t++)e.slot.getSlotElementId()==allAdUnits[t].code&&"viewability"==allAdUnits[t].customParams.refresh.type&&function(e){setTimeout(function(){hbRefreshBid(allAdUnits[e])},1e3*allAdUnits[e].customParams.refresh.seconds)}(t)}function waldoAddCloseBtn(e){for(var t=0,a=adUnits.length;t<a;t++)if(e.slot.getSlotElementId()==adUnits[t].code&&adUnits[t].customParams.sticky_footer&&!e.isEmpty){var o=adUnits[t].customParams.slotNo,s=document.getElementById(e.slot.getSlotElementId()),i=s.getElementsByTagName("div")[0],n=i.getElementsByTagName("iframe")[0],d=n.getAttribute("width"),r=document.createElement("div");r.setAttribute("id","waldo-close-button"),r.style.width=d+"px",r.style.marginLeft="auto",r.style.marginRight="auto",r.style.textAlign="right",r.innerHTML='<a style="text-decoration: none;" href="#">Close X</a>',n.style.width=d+"px",i.parentNode.insertBefore(r,i),r.getElementsByTagName("a")[0].onclick=function(e){e.preventDefault(),s.parentNode.removeChild(s),clearTimeout(waldoTimeOuts[o])}}}function waldoPassbackInit(e){for(var t=0,a=adUnits.length;t<a;t++)if(e.slot.getSlotElementId()==adUnits[t].code&&adUnits[t].customParams.passback){var o=adUnits[t].customParams.passback,s=document.getElementById("waldo-tag-"+adUnits[t].customParams.passback);if(e.isEmpty){if(n=document.getElementById(e.slot.getSlotElementId())){var i=n.getElementsByTagName("div")[0];n.removeChild(i)}if(!s){var n=document.getElementById(e.slot.getSlotElementId()),d=waldoLoadPassback(adUnits[t].customParams.passback),r=document.createElement("div");r.setAttribute("id",d.code),n.parentNode.insertBefore(r,n),waldoInitTags([d]),googletag.pubads().refresh([gptAdSlots[adUnits[t].customParams.passback]]),0==adUnits[t].customParams.passback_refresh&&(clearTimeout(waldoTimeOuts[o]),clearTimeout(waldoTimeOuts[adUnits[t].customParams.slotNo]))}}else if(s){waldoTimeOuts[o]&&clearTimeout(waldoTimeOuts[o]);var l=document.getElementById("waldo-tag-"+adUnits[t].customParams.passback);l&&l.parentNode.removeChild(l)}}}function waldoInterstitialInit(e){if(interstitialDone)return!1;for(var t=0,a=adUnits.length;t<a;t++)if(e.slot.getSlotElementId()==adUnits[t].code&&adUnits[t].customParams.interstitial){interstitialDone=1;var o=document.getElementById(adUnits[t].code);if(browserWidth>=breakpoints.desktop&&!e.isEmpty){var s=adUnits[t].customParams.interstitial_duration,i=document.createElement("div");i.setAttribute("id","waldo-counter"),i.innerHTML='Ad will close in <span class="count">'+s+"</span> seconds",o.appendChild(i),o.className="waldo-overlay",o.style.display="block";var n=o.getElementsByTagName("iframe")[0],d=o.getElementsByTagName("div")[0];d.style.left="50%",d.style.top="50%",d.style.position="absolute",d.style.width=n.clientWidth+"px",d.style.height=n.clientHeight+"px",d.style.marginLeft="-"+parseInt(n.clientWidth)/2+"px",d.style.marginTop="-"+parseInt(n.clientHeight)/2+"px";var r=setInterval(function(){var e=s--;i.getElementsByTagName("span")[0].innerHTML=e,0==e&&(clearInterval(r),o.parentNode.removeChild(o))},1e3)}}}function waldoInitTags(e){var t,a=[];for(c=document.documentElement||document.body.parentNode||document.body,index=0;index<e.length;++index){var o=e[index],s=o.code,i=document.getElementById(s);if(i&&void 0===waldoTagsStatus[s]){a.push(o.customParams.slotNo),waldoTagsStatus[s]=1,bidDivAvailable=1,waldoAdRefreshes[o.customParams.slotNo]=0;var n=document.createElement("script");if(n.type="text/javascript",n.text="googletag.cmd.push(function() { googletag.display('"+s+"'); });",i.appendChild(n),o.customParams.sticky_sidebar&&browserWidth>=breakpoints.desktop&&(t=i),o.customParams.sticky_footer?i.className="waldo-sticky-footer":o.customParams.sticky_left||o.customParams.sticky_right?browserWidth>=breakpoints.desktop?o.customParams.sticky_left?i.className="waldo-bfleft":i.className="waldo-bfright":i.style.display="none":o.customParams.interstitial&&(i.style.display="none"),"min_max"==o.customParams.refresh.type){var d=1;browserWidth<breakpoints.desktop&&0==o.customParams.mobile_refresh&&(d=0),d&&hbRandomMinMaxRefresh(e[index])}i.setAttribute("data-processed",!0)}if(t&&"/"!=window.location.pathname){var r,l=t.offsetTop,c=document.documentElement||document.body.parentNode||document.body,m=void 0!==window.pageYOffset;l+=550,window.onscroll=function(e){r=m?window.pageYOffset:c.scrollTop,t.className=r>=l?"waldo-sticky-sidebar":""}}}!waldoImpressionDone&&a.length>0&&(waldoRecordImpression(a),waldoImpressionDone=1)}function hbRefreshBid(e){var t=["prebid"],a=[];if(a[e.customParams.slotNo]={a9:!1,prebid:!1},5==waldoAdRefreshes[e.customParams.slotNo]){e.bids;for(i=0;i<e.bids.length;i++)"openx"!=e.bids[i].bidder&&"aol"!=e.bids[i].bidder&&"sovrn"!=e.bids[i].bidder||(pbjs.removeAdUnit(e.code),e.bids.splice(i,1),pbjs.addAdUnits([e]))}pbjs.que.push(function(){pbjs.requestBids({timeout:PREBID_TIMEOUT,adUnitCodes:[e.code],bidsBackHandler:function(o){!function(o){"a9"===o?a[e.customParams.slotNo].a9=!0:"prebid"===o&&(a[e.customParams.slotNo].prebid=!0);t.map(function(t){return a[e.customParams.slotNo][t]}).filter(Boolean).length===t.length&&googletag.cmd.push(function(){pbjs.setTargetingForGPTAsync([e.code]),googletag.pubads().refresh([gptAdSlots[e.customParams.slotNo]])})}("prebid")}})})}function hbRandomMinMaxRefresh(e){if(browserWidth>=breakpoints.desktop)var t=parseInt(e.customParams.refresh.desktop.min),a=parseInt(e.customParams.refresh.desktop.max);else t=parseInt(e.customParams.refresh.mobile.min),a=parseInt(e.customParams.refresh.mobile.max);var o=e.customParams.slotNo,s=parseInt(e.customParams.refresh.limit),i=getRandomNumber(t,a);waldoTimeOuts[o]=setTimeout(function(){waldoAdRefreshes[o]?waldoAdRefreshes[o]++:waldoAdRefreshes[o]=1,hbRefreshBid(e),waldoAdRefreshes[o]!=s&&hbRandomMinMaxRefresh(e)},1e3*i)}function getRandomNumber(e,t){return Math.floor(Math.random()*(t-e+1)+e)}function waldoGeoBidsCheck(e){for(i=0;i<adUnits.length;i++){var t=adUnits[i].bids;t=t.filter(function(t){return"sovrn"!=t.bidder?1:"US"==e||"CA"==e||"GB"==e||"AU"==e?1:void 0}),adUnits[i].bids=t}}waldoInitScripts(),pbjs.que=pbjs.que||[],pbjs.que.push(function(){pbjs.aliasBidder("appnexus","districtm"),pbjs.aliasBidder("appnexus","9284")}),0==bidDivAvailable&&(document.addEventListener("DOMContentLoaded",function(){adTagsInitFlag||(waldoInitTags(adUnits),adTagsInitFlag=1)},!1),window.addEventListener("load",function(){adTagsInitFlag||(waldoInitTags(adUnits),adTagsInitFlag=1)},!1)),setTimeout(function(){refEn=1},3e4),null===waldoCountry?waldoGetUserData():(waldoInitCmp(),fetchHeaderBids())}function waldoDisplayPassbacksBlockedPages(){for(var e=0;e<adUnits.length;e++){var t=adUnits[e],a=document.getElementById(t.code);if(a){var o=waldoLoadPassback(t.customParams.passback),s=document.createElement("div");s.setAttribute("id",o.code),t.customParams.sticky_footer&&(s.className="waldo-sticky-footer"),a.parentNode.insertBefore(s,a);var i=document.createElement("script");i.type="text/javascript",i.text="googletag.cmd.push(function() { googletag.display('"+o.code+"'); });",s.appendChild(i),googletag.cmd.push(function(){googletag.pubads().refresh([gptAdSlots[t.customParams.passback]])}),console.log("ref")}}}function waldoGetUserData(){var e="https:"==document.location.protocol,t=(new XMLHttpRequest,(e?"https:":"http:")+"//ipfind.co/me?auth=3757a9b9-5759-4813-bc1a-7fa0b8ba94c1"),a=new XMLHttpRequest;a.onreadystatechange=function(){if(a.readyState===XMLHttpRequest.DONE)if(200===a.status){var e=JSON.parse(a.responseText);waldoCreateCookie("waldo_country",e.country_code,90),waldoCreateCookie("waldo_continent",e.continent_code,90),waldoInitCmp(),waldoGeoBidsCheck(e.country_code),fetchHeaderBids()}else waldoInitCmp(),waldoGeoBidsCheck(""),fetchHeaderBids()},a.open("GET",t,!0),a.timeout=550,a.send()}function waldoLoadPassback(e){for(i=0;i<passbackAdUnits.length;i++)if(passbackAdUnits[i].customParams.slotNo==e)return passbackAdUnits[i]}function waldoCreateCookie(e,t,a){var o="";if(a){var s=new Date;s.setTime(s.getTime()+24*a*60*60*1e3),o="; expires="+s.toUTCString()}document.cookie=e+"="+t+o+"; path=/"}function waldoReadCookie(e){for(var t=e+"=",a=document.cookie.split(";"),o=0;o<a.length;o++){for(var s=a[o];" "==s.charAt(0);)s=s.substring(1,s.length);if(0==s.indexOf(t))return s.substring(t.length,s.length)}return null}function waldoEmailDetected(e){var t=new XMLHttpRequest,a="url="+e;t.open("POST","https://thisiswaldo.com/email-detected",!0),t.setRequestHeader("Content-type","application/x-www-form-urlencoded"),t.send(a)}function waldoRecordImpression(e){var t=e.join(","),a="https:"==document.location.protocol,o=new XMLHttpRequest,s=(a?"https:":"http:")+"//thisiswaldo.com/new-impression",i="site_id="+siteId+"&zone_ids="+t;o.open("POST",s,!0),o.setRequestHeader("Content-type","application/x-www-form-urlencoded"),o.send(i)}var waldo=waldo||{};waldo.refreshTag=function(e){for(var t=0;t<adUnits.length;t++)adUnits[t].code==e&&hbRefreshBid(adUnits[t])},waldo.refreshAllTags=function(){fetchHeaderBids()};