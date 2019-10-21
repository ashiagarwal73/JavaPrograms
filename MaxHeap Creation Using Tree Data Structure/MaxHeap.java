class MaxHeap{
    private HeapNode root;
    private QueueNode queueHead;
    private QueueNode queueTail;
    void insert(int data){
        if(root==null){
            root=new HeapNode(data);
        }
        else{
            boolean inserted=false;
            HeapNode temp=root;
            while(!inserted){
                if(temp.left==null){
                    temp.left=new HeapNode(data);
                    temp.left.parent=temp;
                    inserted=true;
                    rearrangeTree(temp.left);
                }else{
                    insertInQueue(temp.left);
                    if(temp.right==null){
                        temp.right=new HeapNode(data);
                        temp.right.parent=temp;
                        inserted=true;
                        rearrangeTree(temp.right);
                    }else{
                        insertInQueue(temp.right);
                        temp=deleteFromQueue();
                    }
                }
            }
        }

    }
    private void rearrangeTree(HeapNode node){
        queueHead=null;
        queueTail=null;
        if(node.parent==null || node.parent.value>node.value)
        {
            return;
        }else{
            int data=node.parent.value;
            node.parent.value=node.value;
            node.value=data;
            rearrangeTree(node.parent);
        }
    }
    private void insertInQueue(HeapNode heapNode){
        if(queueHead==null){
            queueHead=new QueueNode(heapNode);
            queueTail=queueHead;    
        }else{
            QueueNode newNode=new QueueNode(heapNode);
            queueTail.next= newNode;
            queueTail=newNode;
        }
    }
    private HeapNode deleteFromQueue(){
        QueueNode temp=queueHead;
        queueHead=queueHead.next;
        return temp.heapNode;
    }
}
