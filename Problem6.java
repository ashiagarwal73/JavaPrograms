import java.util.Scanner;
class EventPlanning{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextLine()){
            String requirements=sc.nextLine();
            if(requirements.equals("")){
                break;
            }
            String arr[]=requirements.split(" ");
            int n=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);
            int h=Integer.parseInt(arr[2]);
            int w=Integer.parseInt(arr[3]);
            boolean found=false;
            int foundprice=10001; // since p is always less than 10k
            for(int i=0;i<h;i++){
                int price=Integer.parseInt(sc.nextLine());
                if(price*n>b){
                    sc.nextLine();
                    continue;
                }else{
                    String weeks=sc.nextLine();
                    String[] str=weeks.split(" ");
                    for(int j=0;j<str.length;j++){
                        try{
                            if(j<w && Integer.parseInt(str[j])>=n && foundprice>price){
                                found=true;
                                foundprice=price;
                            }
                        }catch(Exception e){
                            
                        }
                    }
                }
            }
            if(found){
                System.out.println(foundprice*n);
            }else{
                System.out.println("stay home");
            }
        }
        sc.close();
    }
}