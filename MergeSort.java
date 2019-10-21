class MergeSort{
    public static void main(String args[])
    {
        int arr[]={5,6,2,4,9,2,11,7};
        mergeSort(arr,0,7);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static int mergeSort(int arr[],int start,int end)
    {
       if(start>=end)
       {
           return 0;
       }
       int mid=(start+end)/2;
       mergeSort(arr,start,mid);
       mergeSort(arr,mid+1,end);
       merge(arr,start,mid,end);
       return 0;
    }
    public static void merge(int arr[],int start,int mid,int end)
    {
       if(end-start==1)
       {
           if(arr[start]<arr[end])
           {
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=arr[start];
           }
           return;
       }
       int A[]=new int[mid-start+1];
       int Acounter=0;
       int B[]=new int[end-mid];
       int Bcounter=0;
       for(int i=start;i<=end;i++)
       {
           if(i<=mid)
           {
               A[Acounter++]=arr[i];
           }
           else{
               B[Bcounter++]=arr[i];
           }
       }
        Acounter=0;
        Bcounter=0;
        int ArrCounter=0;
        while(Acounter<A.length && Bcounter<B.length)
        {
            if(A[Acounter]<B[Bcounter])
            {
                arr[ArrCounter++]=A[Acounter];
                Acounter++;
            }
            else{
                arr[ArrCounter++]=B[Bcounter];
                Bcounter++;
            }
        }
        if(Acounter!=A.length)
        {
            for(int i=Acounter;i<A.length;i++)
            {
                arr[ArrCounter++]=A[Acounter++];
            }
        }
        if(Bcounter!=B.length)
        {
            for(int i=Bcounter;i<B.length;i++)
            {
                arr[ArrCounter++]=B[Bcounter++];
            }
        }
    }
}