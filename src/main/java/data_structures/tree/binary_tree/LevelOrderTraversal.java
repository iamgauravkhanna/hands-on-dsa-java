package data_structures.tree.binary_tree;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(12);
        binaryTree.insert(8);
        binaryTree.root.left.left = new Node(4);
        binaryTree.levelOrder();
    }
}

