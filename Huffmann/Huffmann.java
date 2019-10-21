import java.util.*;
class Huffmann{
    String code="";
    String encodedString;
    String decodedString;
    NodeHuffmann root;
    HashMap<String,String> charCode=new HashMap<>();
    public static void main(String[] args) {
        Huffmann huffmann=new Huffmann();
        String initialString="The bird is the word";
        System.out.println("Initial String: "+initialString);
        huffmann.huffmann_encoding("The bird is the word");
        System.out.println("Encoded String: "+huffmann.encodedString);
        huffmann.huffmann_decoding(huffmann.encodedString, huffmann.root);
        System.out.println("Decoded String: "+huffmann.decodedString);
    }
    void huffmann_encoding(String data){
        List<NodeHuffmann> listOfNode=new ArrayList<>();
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<data.length();i++){
            if(!hashMap.containsKey(data.charAt(i)+""))
                hashMap.put((data.charAt(i))+"", 1);
            else
                hashMap.put(data.charAt(i)+"", (hashMap.get(data.charAt(i)+"")+1));      
        }
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            NodeHuffmann temp=new NodeHuffmann(null,null,entry.getKey(),entry.getValue());
            listOfNode.add(temp);
        }
        Collections.sort(listOfNode);
        createTree(listOfNode);
        
        if(listOfNode.size()==1){
            getCode(listOfNode.get(0));
            String encodedString="";
            for(int i=0;i<data.length();i++){
                encodedString=encodedString+charCode.get(data.charAt(i)+"");
            }
            this.encodedString=encodedString;
            this.root=listOfNode.get(0);
        }
    }
    void createTree(List<NodeHuffmann> listOfNode){
        if(listOfNode.size()<2)
            return;
        NodeHuffmann left=listOfNode.get(0);
        NodeHuffmann right=listOfNode.get(1);
        Integer sum=left.frequency+right.frequency;
        NodeHuffmann newNode=new NodeHuffmann(left, right, "undefined", sum);
        listOfNode.remove(0);
        listOfNode.remove(0);
        listOfNode.add(newNode);
        Collections.sort(listOfNode);
        createTree(listOfNode);
    }
    void getCode(NodeHuffmann tree){
        if(tree.left!=null){
            code=code+"0";
            getCode(tree.left);
        }
        if(tree.right!=null){
            code=code+"1";
            getCode(tree.right);
        }
        if(tree.left==null && tree.right==null){
            charCode.put(tree.charac, code);
        }
        if(code.length()>0)
            code=code.substring(0, code.length()-1);            
    }
    void printTree(NodeHuffmann tree){
        if(tree.left!=null)
        {
            printTree(tree.left);
        }
        System.out.println("char: "+tree.charac+" frequency"+tree.frequency);
        if(tree.right!=null)
        {
            printTree(tree.right);
        }
    }
    void huffmann_decoding(String encodedString,NodeHuffmann tree){
        String decodedString="";
        NodeHuffmann temp=tree;
        for(int i=0;i<encodedString.length();i++){
            if(encodedString.charAt(i)=='0')
            {
                NodeHuffmann left=temp.left;
                if(left!=null && left.left==null && left.right==null){
                    decodedString=decodedString+left.charac;
                    temp=tree;
                }
                else 
                    temp=left;    
            }
            else if(encodedString.charAt(i)=='1'){
                NodeHuffmann right=temp.right;
                if(right!=null && right.left==null && right.right==null){
                    decodedString=decodedString+right.charac;
                    temp=tree;
                }
                else 
                    temp=right;
            }
        }
        this.decodedString=decodedString;
    }
}