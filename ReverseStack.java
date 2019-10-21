class ReverseStack{
    public static void main(String[] args) {
        Node top=null;
        int[] elements={12,14,16,18,20,22,28};
        StackUsingLinkList stackUsingLinkList=new StackUsingLinkList();
        for(int i=0;i<elements.length;i++)
        {
            top=stackUsingLinkList.push(elements[i],top);
        }
        stackUsingLinkList.print(top);
        Node previousNode,currentNode,nextNode;
        previousNode=null;
        currentNode=top;
        nextNode=currentNode.getNextNode();
        while(true)
        {
            currentNode.setNextNode(previousNode);
            if(nextNode==null)
                break;
            previousNode=currentNode;
            currentNode=nextNode;
            nextNode=nextNode.getNextNode();    
        }
        stackUsingLinkList.print(currentNode);

    }
}
