class DoublyNode{
    private DoublyNode left;
    private DoublyNode right;
    private int value;
    public void setLeft(DoublyNode left) {
        this.left = left;
    }
    public void setRight(DoublyNode right) {
        this.right = right;
    }
    public DoublyNode getLeft() {
        return left;
    }
    public DoublyNode getRight() {
        return right;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
