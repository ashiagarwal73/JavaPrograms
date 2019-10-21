class RemoveRepeatedAdjacentCharacter{
    public static void main(String[] args) {
        System.out.println(removeRepeated("aabeeddacddd"));
    }
    public static String removeRepeated(String str){
        int pointer=0;
        while(pointer<str.length()){
            if(pointer==str.length()-1 || str.charAt(pointer)!=str.charAt(pointer+1)){
                pointer++;
            }
            else{
                int start=pointer;
                while(pointer<str.length()-1 && str.charAt(pointer)==str.charAt(pointer+1)){
                    pointer++;
                }
                int last=pointer;
                str=str.substring(0, start)+str.substring(last+1,str.length());
                pointer=start>0?start-1:0; 
            }
        }
        return str.equals("")?null:str;
    }
}
