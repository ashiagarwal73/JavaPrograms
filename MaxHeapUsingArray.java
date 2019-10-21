class MaxHeapUsingArray{
    int arr[];
    int tail=-1;
    int arraySize;
    MaxHeapUsingArray(int arraySize){
        this.arraySize=arraySize;
        arr=new int[arraySize];
    }
    int[] heapify(int[] arr){
        int length=arr.length;
        for(int i=length-1;i>=0;i--){
            int left= 2*i +1;
            int right= 2*i +2;
            int index=i;
            while(index<length){
                if(right>=length ){
                    if(left>=length){
                        break;
                    }else{
                        if(arr[index]<arr[left]){
                            int temp=arr[index];
                            arr[index]=arr[left];
                            arr[left]=temp;
                            index=left;
                            left= 2*index +1;
                            right= 2*index +2;
                        }
                    }
                }else{
                    if(arr[left]>arr[right] && arr[index]<arr[left]){
                        int temp=arr[index];
                        arr[index]=arr[left];
                        arr[left]=temp;
                        index=left;
                        left= 2*index +1;
                        right= 2*index +2;
                    }else if(arr[right]>arr[left] && arr[index]<arr[right]){
                        int temp=arr[index];
                        arr[index]=arr[right];
                        arr[right]=temp;
                        index=right;
                        left= 2*index +1;
                        right= 2*index +2;
                    }
                }   
                
                
            } 
            
        }
        return arr;
    }
    void insert(int data) throws Exception{
        tail++;
        if(tail<arraySize){
            arr[tail]=data;
            rearrangeBottomUp();
            return;
        }else{
            throw new Exception("Heap is Full");
        }
    }
    void rearrangeBottomUp(){
        int temp=tail;
        int parent=(temp-1)/2;
        while(temp>=0 && arr[parent]<arr[temp]){
            int value=arr[parent];
            arr[parent]=arr[temp];
            arr[temp]=value;
            temp=parent;
            parent=(temp-1)/2;
        }
    }
    int delete() throws Exception{
        if(tail>=0){
            int del=arr[0];
            arr[0]=arr[tail];
            tail--;
            rearrangeTopDown();
            return del;
        }
        throw new Exception("Empty Heap");
    }
    void rearrangeTopDown(){
        int index=0;
        int left=2*index+1;
        int right=2*index+2;
        while(left<=tail && right<=tail){
            if(arr[right]<arr[left]){
                int temp=arr[index];
                arr[index]=arr[left];
                arr[left]=temp;
                index=left;
                left=2*index+1;
                right=2*index+2;
            }else if(arr[left]<arr[right]){
                int temp=arr[index];
                arr[index]=arr[right];
                arr[right]=temp;
                index=right;
                left=2*index+1;
                right=2*index+2;
            }
        }
    }
}