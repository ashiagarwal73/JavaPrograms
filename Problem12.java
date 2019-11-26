import java.util.HashMap;

class MaxAdj{
    static int count=0;
    public static void main(String[] args) {
        int arr[]={2,4,3,1,5,6};
        System.out.println(maxAdjacent(arr,0,5));
    }
    static HashMap<String,Integer> maxAdjHash=new HashMap<>();
    static int maxAdjacent(int arr[], int sum, int last){
        count++;
        if(maxAdjHash.containsKey(sum+":"+last)){
            return maxAdjHash.get(sum+":"+last);
        }
        int ans;
        if(last<0){
            ans= sum;
        }else{
            ans= max(maxAdjacent(arr, sum, last-1),maxAdjacent(arr, sum+arr[last], last-2));
        }
        maxAdjHash.put(sum+":"+last,ans);
        return ans;
    }
    static int max(int a,int b){
        return a>b?a:b;
    }
}