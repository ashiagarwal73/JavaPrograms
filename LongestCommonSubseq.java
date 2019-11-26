import java.util.*;
class LongestCommonSubSeq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two string");
        System.out.print("String 1: ");
        String string1=sc.nextLine();
        System.out.print("String 2: ");
        String string2=sc.nextLine();
        ArrayNode arr[][]=new ArrayNode[string1.length()+1][string2.length()+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=new ArrayNode(-1, 'X');
            }
        }
        rowinit(arr);
        coloumninit(arr);
        arr[0][0].setParent('M');
        LCS(string1,string2,arr);
        String common=findLCS(arr,string1.length(),string2.length(),string1);
        System.out.println("Longest common subsequence: "+common);
    }
    public static void LCS(String str1,String str2,ArrayNode arr[][]){
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    int op1=arr[i-1][j-1].getValue();
                    int op2=arr[i-1][j].getValue()+1;
                    int op3=arr[i][j-1].getValue()+1;
                    if(op1<op2&&op1<op3){
                        arr[i][j].setValue(op1);
                        arr[i][j].setParent('M');
                    }else if(op2<op1&&op2<op3){
                        arr[i][j].setValue(op2);
                        arr[i][j].setParent('I');
                    }else{
                        arr[i][j].setValue(op3);
                        arr[i][j].setParent('D');
                    }
                }else{
                    int op2=arr[i-1][j].getValue()+1;
                    int op3=arr[i][j-1].getValue()+1;
                    if(op2<op3){
                        arr[i][j].setValue(op2);
                        arr[i][j].setParent('I');
                    }else{
                        arr[i][j].setValue(op3);
                        arr[i][j].setParent('D');
                    }
                }
            }
        }
        // System.out.println("\n");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j].getValue()+"    ");
        //     }
        //     System.out.println("");
        // }
        // System.out.println("\n");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j].getParent()+"    ");
        //     }
        //     System.out.println("");
        // }
        return ;
    }
    public static String findLCS(ArrayNode arr[][],int i,int j,String string){
        if(i<=0||j<=0){
            return "";
        }
        if(arr[i][j].getParent()=='M'){
            return findLCS(arr, i-1, j-1,string)+string.charAt(i-1);
        }
        if(arr[i][j].getParent()=='I'){
            return findLCS(arr, i-1, j,string);
        }
        if(arr[i][j].getParent()=='D'){
            return findLCS(arr, i, j-1,string);
        }
        else{
            return "";
        }
        
    }
    public static void rowinit(ArrayNode arr[][]){
        for(int i=0;i<arr.length;i++){
            arr[i][0].setValue(i);
            arr[i][0].setParent('D');
        }
    }
    public static void coloumninit(ArrayNode arr[][]){
        for(int i=0;i<arr[0].length;i++){
            arr[0][i].setValue(i);
            arr[0][i].setParent('I');
        }
    }
}
class ArrayNode{
    int value;
    char parent;
    /**
     * @return the parent
     */
    public char getParent() {
        return parent;
    }
    /**
     * @param parent the parent to set
     */
    public void setParent(char parent) {
        this.parent = parent;
    }
    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    ArrayNode(int value,char parent){
        this.value=value;
        this.parent=parent;
    }

}