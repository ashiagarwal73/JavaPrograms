class AmericanExpress{
    public static int solution(int[] A, int[] B){
        int sumOfArrayA=0;
        int sumOfArrayB=0;
        int length=0;
        int addedSumA;
        int addedSumB;
        if(A.length!=B.length || A.length<1){
            return 0;
        }else{
            length=B.length;
            addedSumA=A[0];
            addedSumB=B[0];
        }
        for(int i=0;i<length;i++){
            sumOfArrayA = sumOfArrayA + A[i];
            sumOfArrayB = sumOfArrayB + B[i];
        }
        if(sumOfArrayA!=sumOfArrayB){
            return 0;
        }
        int counter=0;
        for(int i=1;i<length;i++){
            int leftsumA = sumOfArrayA - addedSumA;
            int leftsumB = sumOfArrayB - addedSumB;
            int rightsumA =sumOfArrayA - leftsumA;
            int rightsumB =sumOfArrayB - leftsumB;
            if(leftsumA==rightsumA && leftsumB==rightsumB && leftsumA==leftsumB){
                counter++;
            }
            addedSumA=addedSumA + A[i];
            addedSumB=addedSumB + B[i];
        }
        return counter;
    }
    public static void main(String args[]){
        int[] a={4,-1,0,3};
        int[] b={-2,5,0,3};
        System.out.println(solution(a,b));
    }
   
}