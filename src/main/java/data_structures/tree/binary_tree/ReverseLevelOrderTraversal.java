package data_structures.tree.binary_tree;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Reverse Level Order traversal of binary tree is :: ");
        tree.reverseLevelOrder(tree.root);
    }
}

