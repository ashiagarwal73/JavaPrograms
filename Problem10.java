import java.util.*;
class HardSeq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    HashMap<Integer,Integer> hash=new HashMap<>();
		    int seq[]=new int[n];
		    seq[0]=0;
		    for(int j=1;j<n;j++){
		        if(hash.containsKey(seq[j-1])){
		            int indexKey=hash.get(seq[j-1]);
		            seq[j]=j-indexKey;
		        }else {
		            seq[j]=0;
		        } 
		        hash.put(seq[j-1],j-1);
		    }
    		int count=0;    
    		int x=seq[n-1];
    		for(int j=0;j<n;j++){
    		    if(x==seq[j]){
    		        count++;
    		    }   
    		}
    		System.out.println(count);
        }
        sc.close();
	}
}
