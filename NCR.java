import java.util.*;
class NCR{
    static int count=0;
    public static void main(String[] args){
        System.out.println(nCr(20,15));git        
    }
static HashMap<String,Integer> hash=new HashMap<>();
    static int nCr(int n,int k){
        count++;
        if(hash.containsKey(n+":"+k)){
            return hash.get(n+":"+k);
        }
        int ans;
        if(n==k){
            return 1;
        }
        if(k==0){
            return 1;
        }
        else{
            ans= nCr(n-1,k-1)+nCr(n-1,k);
        }
        hash.put(n+":"+k,ans);
        return ans;
    }
}
