import java.util.*;
class SumOfTwoNumberInArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num;
        num=sc.nextInt();
        System.out.println(check(n,arr,num));
    }
    public static boolean check(int n,Integer arr[],int num)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        for(int i=0;i<n;i++)
        {
            Integer left=num-arr[i];
            if(list.contains(left))
            {
                return true;
            }
        }
        return false;
    }
}