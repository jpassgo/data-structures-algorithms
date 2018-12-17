package personal.jeffpascoe.datastructuresalgorithms.trees;

public class BinarySearchTree {
    Node root;

    public <E extends Comparable> void insert(E e) {
        if(root == null) {
            root = new Node(e);
        } else {
            insertBST(new Node(e), root);
        }
    }

    private void insertBST(Node node, Node currentNode) {
        if(node.getData().compareTo(currentNode.getData()) < 0) {
            if(currentNode.leftChild == null) {
                currentNode.setLeftChild(node);
            } else {
                insertBST(node, currentNode.leftChild);
            }
        } else if(node.getData().compareTo(currentNode.getData()) > 0) {
            if(currentNode.rightChild == null) {
                insertBST(node, currentNode.rightChild);
            } else {
                insertBST(node, currentNode.rightChild);
            }
        }
    }

    //print nodes
    //retrieve elements
}
