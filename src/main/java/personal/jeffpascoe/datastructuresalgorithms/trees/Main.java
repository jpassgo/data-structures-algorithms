package personal.jeffpascoe.datastructuresalgorithms.trees;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        List<Integer> ints = Arrays.asList(1,2,3,42,5,98,4,2323,4,6);

        for(Integer i : ints) {
            bst.insert(i);
        }
        bst.print("preorder");
    }

}
