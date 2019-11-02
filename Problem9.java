import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
            int n=sc.nextInt();
            sc.nextLine();
		    StringBuilder[] participants=new StringBuilder[n];
		    for(int i=0;i<n;i++){
		        participants[i]=new StringBuilder(sc.nextLine());
		    }
		    for(int i=0;i<n-1;i++){
		        for(int j=0;j<10;j++){
		            char ch1=participants[i].charAt(j);
		            char ch2=participants[i+1].charAt(j);
		            if(ch1==ch2){
		                participants[i+1].setCharAt(j,'0');
		            }else{
		                participants[i+1].setCharAt(j,'1');
		            }
		        }
		    }
		    int max=0;
		    for(int j=0;j<10;j++){
		        if(participants[n-1].charAt(j)=='1'){
		            max++;
		        }
		    }
		    System.out.println(max);
		}
		
	}
}
