import java.util.*;
class StackUsingLinkList{
    public static void main(String args[]){
       while(true){
        System.out.println("***************************************");   
        System.out.println("Press 1 : To Push element in stack");
        System.out.println("Press 2 : To Pop element in stack");
        System.out.println("Press 3 : To Print Stack");
        System.out.println("Press 4 : To End");
        System.out.println("***************************************");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        StackUsingLinkList stackUsingLinkList=new StackUsingLinkList();
        Node top=null;
        switch(choice)
        {
            case 1:
                System.out.println("Enter Element");
                int element=sc.nextInt();   
                top=stackUsingLinkList.push(element,top);
                break;
            case 2:
                top=stackUsingLinkList.pop(top);
                break;
            case 3:
                stackUsingLinkList.print(top);
                break;
            case 4:return;    
        }
       }
        
    }
    Node push(int element,Node top){
        System.out.println("Pushed: "+element);
        if(top==null)
        {
            top=new Node();
            top.setValue(element);
            top.setNextNode(null);
            return top;
        }
        Node newNode=new Node();
        newNode.setValue(element);
        newNode.setNextNode(top);
        return newNode;        
    }
    Node pop(Node top){
            if(top==null)
            {
                System.out.println("Underflow");
                return null;
            }
            System.out.println("Popped :"+top.getValue());
            return top.getNextNode();
    }
    void print(Node top){
        System.out.println("Printing Stack"); 
        Node temp=top;
            while(temp!=null)
            {
                System.out.println(temp.getValue());
                temp=temp.getNextNode();
            }
    }
}