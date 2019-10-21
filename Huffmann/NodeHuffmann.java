class NodeHuffmann  implements Comparable<NodeHuffmann>{
    NodeHuffmann left;
    NodeHuffmann right;
    String charac;
    Integer frequency;
    NodeHuffmann(NodeHuffmann left,NodeHuffmann right,String charac,Integer frequency){
        this.left=left;
        this.right=right;
        this.charac=charac;
        this.frequency=frequency;
    }
    @Override
    public int compareTo(NodeHuffmann node) {
        return this.frequency.compareTo(node.frequency);
    }
}
