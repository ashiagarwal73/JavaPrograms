import java.util.HashMap;
import java.util.Scanner;

class EventPlanning{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do{
            int n=sc.nextInt();
            int b=sc.nextInt();
            int h=sc.nextInt();
            int w=sc.nextInt();
            boolean found=false;
            int foundprice=0;
            HashMap<Integer,Integer> hotels=new HashMap<>();
            for(int i=0;i<h;i++){
                int price=sc.nextInt();
                if(price*n>b){
                    continue;
                }else{
                    sc.nextLine();
                    String weeks=sc.nextLine();
                    String[] str=weeks.split(" ");
                    for(int j=0;j<weeks.length();j++){
                        try{
                            if(Integer.parseInt(str[j])>=n){
                                found=true;
                                foundprice=price;
                                break;
                            }
    
                        }catch(Exception e){
                            
                        }
                    continue;
                    }
                }
                if(found)
                    break;
            }
            if(found){
                System.out.println();
                System.out.print(foundprice*n);
            }else{
                System.out.println();
                System.out.print("stay home");
            }
        }while(!sc.nextLine().equals(""));
        sc.close();
    }
}