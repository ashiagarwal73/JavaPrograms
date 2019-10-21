class QuickSort{
    public static void main(String args[])
    {
        int arr[]={5,6,2,4,9,2,11,7};
        quickSort(arr,0,7);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int quickSort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int j=partition(arr,end);
            quickSort(arr,start,j-1);
            quickSort(arr,j+1,end);
        }
        return 0;
    }
    public static int partition(int arr[], int end)
    {
        int i=-1;
        int pivot=arr[end];
        for(int j=0;j<end;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;   
        arr[end]=arr[i];
        arr[i]=pivot;
        return i;
    }
}
