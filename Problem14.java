class Solution {
    public static int maxProduct(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        int maxProduct=nums[0];
        int localProductMin=nums[0];
        int localProductMax=nums[0];

        for(int i=1;i<nums.length;i++){
            int pr1=localProductMin*nums[i];
            int pr2=localProductMax*nums[i];
            int pr3=nums[i];
            if(pr1>=pr2&&pr1>=pr3){
                localProductMax=pr1;
                localProductMin=pr2<pr3?pr2:pr3;
            }
            else if(pr2>pr1&&pr2>=pr3){
                localProductMax=pr2;
                localProductMin=pr1<pr3?pr1:pr3;
            }
            else{
                localProductMax=pr3;
                localProductMin=pr1<pr2?pr1:pr2;
            }            
            if(localProductMin>maxProduct){
                maxProduct=localProductMin;
            }
            if(localProductMax>maxProduct){
                maxProduct=localProductMax;
            }
            
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxProduct(arr));
    }
}