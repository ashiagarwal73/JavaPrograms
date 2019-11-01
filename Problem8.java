import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String string=sc.nextLine();
            string=string.toLowerCase();
            string=string.replaceAll(" ", "");
            string=string.replaceAll("\\!", "");
            string=string.replaceAll("\\.", "");
            string=string.replaceAll("\\,", "");
            string=string.replaceAll("\\?", "");
            if(string.equalsIgnoreCase("done")){
                break;
            }
            boolean isPalindrome=isPalindrome(string);
            if(isPalindrome){
                System.out.println("You won't be eaten!");
            }else{
                System.out.println("Uh oh..");
            }
        }
        sc.close();
        System.exit(0);
    }

    static boolean isPalindrome(String string){
        int i=0;
        int j=string.length()-1;
        while(i<=j){
            if(string.charAt(i)!=string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
