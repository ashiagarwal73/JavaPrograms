class LongestPalindrome {
    int maxlen=0;
    String maxstring="";
    int maxj=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            String str=longestPalindromeWithCenter(i,i,s);
            String str2=longestPalindromeWithCenter(i,i+1,s);
            if(str.length()>str2.length()){
                if(maxlen<str.length()){
                    maxlen=str.length();
                    maxstring=str;
                }
            }
            else if(maxlen<str2.length()){
                  maxlen=str2.length();
                  maxstring=str2;
            }
            
        }
       return maxstring;
    }
    public String longestPalindromeWithCenter(int left,int right,String s){
        String sub="";
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            sub=s.substring(left,right+1);
            left--;
            right++;
        }
        return sub;
    }
    public static void main(String[] args) {
        LongestPalindrome lPalindrome=new LongestPalindrome();
        System.out.println(lPalindrome.longestPalindrome("babad")) ;   
    }
}