import java.util.*;
class Problem3{
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
        int sum;
        sum=sc.nextInt();
        System.out.println(check(n,arr,sum));
    }
    public static boolean check(int n,Integer arr[],int num)
    {
        HashMap<Integer,Integer> hash=new HashMap<>();
	for(int i=0;i<arr.length;i++){
		hash.put(arr[i],arr[i]);	
	}
        for(int i=0;i<n;i++)
        {
            Integer left=num-arr[i];
            if(hash.containsKey(left))
            {
                return true;
            }
        }
        return false;
    }
}
