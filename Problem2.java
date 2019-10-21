class Facebook{
    static int helper(String data){
        if(data.length()>1 && data.charAt(0)=='0'){
            return 0;
        }
        String temp=data;
        while(temp.contains("0")){
            int index=temp.indexOf("0");
            char ch=temp.charAt(index-1);
            if(ch=='1' || ch=='2'){
                temp=temp.substring(index+1);
            }else{
                return 0;
            }
        }
        return numOfWays(data);
    }
    static int numOfWays(String data){
        if(data.equals("")){
            return 1;
        }
        else{
            char ch1=data.charAt(0);
            if(ch1=='1'){
                if(data.length()>=2){
                    return numOfWays(data.substring(1))+numOfWays(data.substring(2));
                }else{
                    return numOfWays(data.substring(1));
                }
            }
            if(ch1=='2'){
                if(data.length()>=2 && data.charAt(1)<='6'){
                    return numOfWays(data.substring(1))+numOfWays(data.substring(2));
                }else{
                    return numOfWays(data.substring(1));
                }
            }
            return numOfWays(data.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(helper("1235"));
    }
}
