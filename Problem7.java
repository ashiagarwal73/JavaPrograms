import java.util.*;
class Main{
    static HashMap<String,String> hashMap=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hashMap.put("A", "A");
        hashMap.put("E", "3");
        hashMap.put("H", "H");
        hashMap.put("I", "I");
        hashMap.put("J", "L");
        hashMap.put("L", "J");
        hashMap.put("M", "M");
        hashMap.put("O", "O");
        hashMap.put("S", "2");
        hashMap.put("T", "T");
        hashMap.put("U", "U");
        hashMap.put("V", "V");
        hashMap.put("W", "W");
        hashMap.put("X", "X");
        hashMap.put("Y", "Y");
        hashMap.put("Z", "5");
        hashMap.put("1", "1");
        hashMap.put("2", "S");
        hashMap.put("3", "E");
        hashMap.put("5", "Z");
        hashMap.put("8", "8");
        while(sc.hasNext()){
            String string=sc.nextLine();
            if(string.equals("")){
                break;
            }
            boolean isMirrored=isMirrored(string);
            boolean isPalindrome=isPalindrome(string);
            if(isPalindrome  && isMirrored){
                System.out.println(string+" -- is a mirrored palindrome.\n");
            }else if(isPalindrome){
                System.out.println(string+" -- is a regular palindrome.\n");
            }else if(isMirrored){
                System.out.println(string+" -- is a mirrored string.\n");
            }else{
                System.out.println(string+" -- is not a palindrome.\n");
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
    static boolean isMirrored(String string){
        int i=0;
        int j=string.length()-1;
        while(i<=j){
            if(!hashMap.containsKey(""+string.charAt(i)) || !hashMap.get(""+string.charAt(i)).equals(""+string.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}