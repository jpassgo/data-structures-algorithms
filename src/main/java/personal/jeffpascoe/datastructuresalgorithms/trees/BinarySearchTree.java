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
            if(currentNode.getLeftChild() == null) {
                currentNode.setLeftChild(node);
            } else {
                insertBST(node, currentNode.getLeftChild());
            }
        } else if(node.getData().compareTo(currentNode.getData()) > 0) {
            if(currentNode.getRightChild() == null) {
                currentNode.setRightChild(node);
            } else {
                insertBST(node, currentNode.getRightChild());
            }
        }
    }

    public void print(String traversalType) {
       String lowerCaseTraversalType = traversalType.toLowerCase();
        switch (lowerCaseTraversalType ) {
            case "preorder":
                preOrder(root);
                break;
            case "inorder":
                inOrder(root);
                break;
            case "postorder":
                postOrder(root);
                break;
            default:
                 System.err.println("Provide the type of traversal you desire the print to use.");
                break;
        }
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            System.out.print(node.getData() + " ");
            inOrder(node.getRightChild());
        }
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.print(node.getData() + " ");
        }
    }


}
