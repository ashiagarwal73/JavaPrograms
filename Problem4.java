import java.util.HashMap;

// Find number of subset of an array that add up to given sum
class Problem4{
    public static void main(String[] args){
        int arr[]={2,4,6,10,16};
        System.out.println(numberOfSubset(arr, 0, 4));
    }
    static HashMap<String,Integer> hash=new HashMap<>();
    
    static int numberOfSubset(int arr[],int start,int sum){
        int answer=0;
        if(hash.containsKey(start+":"+sum)){
            return hash.get(start+":"+sum);
        }
        else if(sum==0){
            answer= 1;
        }
        else if(start>=arr.length){
            answer= 0;
        }
        else if(sum<0){
            answer= 0;
        }
        else if(arr[start]>sum){
            answer= numberOfSubset(arr, start+1, sum);
        }else{
            answer=numberOfSubset(arr, start+1, sum)+numberOfSubset(arr, start+1, sum-arr[start]);
        }
        hash.put(start+":"+sum,answer);
        return answer;
    }
}