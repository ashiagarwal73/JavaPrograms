class Problem13 {
    public static int maxSubArray(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        int maxSum=nums[0];
        int localMax=nums[0];
        for(int i=1;i<nums.length;i++){
            int sum1=localMax+nums[i];
            int sum2=nums[i];
            if(sum1>sum2){
                localMax=sum1;
            }else{
                localMax=sum2;
            }
            if(maxSum<localMax){
                maxSum=localMax;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}