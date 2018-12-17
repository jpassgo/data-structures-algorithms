package personal.jeffpascoe.datastructuresalgorithms.trees;

public class Node<T extends Comparable> implements Comparable<Node> {
    private T data;
    Node parent;
    Node leftChild;
    Node rightChild;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public int compareTo(Node node) {
        return  this.getData().compareTo(node.getData());
    }
}
