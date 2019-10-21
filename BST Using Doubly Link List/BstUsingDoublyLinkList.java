import java.util.*;
class BstUsingDoublyLinkList{
    public static void main(String[] args) {
        DoublyNode rootNode=null;
	int choice; 
        do{
            System.out.println("***************************************");   
            System.out.println("Press 1 : To Push element in Tree");
            System.out.println("Press 2 : To Print Tree");
            System.out.println("Press 3 : To End");
            System.out.println("***************************************");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();    
            BstUsingDoublyLinkList bstUsingDoublyLinkList=new BstUsingDoublyLinkList();
            switch(choice)
            {
                case 1:
                System.out.println("Enter Element");
                int element=sc.nextInt();  
		if(rootNode==null)
			{
			    rootNode=new DoublyNode();
			    rootNode.setValue(element);
			}
		else{ 
                bstUsingDoublyLinkList.push(element, rootNode);
                }
		break;
                case 2:
                System.out.println("Printing Tree");
                bstUsingDoublyLinkList.printTree(rootNode,0);
                break;
            }
        }while(choice!=3);

    }
    void push(int element,DoublyNode rootNode)
    {
            if(element<rootNode.getValue())
            {
                if(rootNode.getLeft()==null)
                {
                    DoublyNode newNode=new DoublyNode();
                    newNode.setValue(element);
                    rootNode.setLeft(newNode); 
                }
                else{
                    push(element, rootNode.getLeft());
                }
            }
            if(element>rootNode.getValue())
            {
                if(rootNode.getRight()==null)
                {
                    DoublyNode newNode=new DoublyNode();
                    newNode.setValue(element);
                    rootNode.setRight(newNode); 
                }
                else{
                    push(element, rootNode.getRight());
                }
            }

    }
    void printTree(DoublyNode rootNode, int space){
        if(rootNode!=null)
        {
	    space += 5;
 	    if(rootNode.getRight()!=null)
            {
                printTree(rootNode.getRight(),space);
            }
    	    for (int i = 5; i < space; i++)  
        	System.out.print(" ");
	    System.out.print(rootNode.getValue());
	    System.out.print("\n"); 
            if(rootNode.getLeft()!=null)
            {
                printTree(rootNode.getLeft(),space);           
            }
           
        }
    }
}
