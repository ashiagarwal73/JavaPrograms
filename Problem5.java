import java.util.*;
class LoanSomeCarBuyer{
    public static void main(String[] args) {
        int duration,noOfRecords;
        double downPayment, amount;
        Scanner sc=new Scanner(System.in);
        while(true){
            duration=sc.nextInt();
            if(duration<0){
                break;
            }
            downPayment=sc.nextDouble();
            amount=sc.nextDouble();
            noOfRecords=sc.nextInt();
            HashMap<Integer,Double> depreciationList=new HashMap<>();
            for(int i=0;i<noOfRecords;i++){
                int month=sc.nextInt();
                double percentage=sc.nextDouble();
                depreciationList.put(month,percentage);
            }
            double amountowe=amount;
            double insuranceValue=amount+downPayment;
            double monthly_payment = amount/duration;
            int count=0;
            System.out.println("");
            while(true){
                if(depreciationList.containsKey(count)){
                    insuranceValue=insuranceValue-((insuranceValue)*depreciationList.get(count));
                }else{
                    insuranceValue=insuranceValue-((insuranceValue)*depreciationList.get(count-1));
                    depreciationList.put(count, depreciationList.get(count-1));
                }
                if(amountowe<insuranceValue){
                    break;
                }
                amountowe=amountowe-monthly_payment;
                count++;
            }
            
            if(count>1){
                System.out.println(count+" months");
            }else{
                System.out.println(count+" month");
            }
        }
        sc.close();
    }
}