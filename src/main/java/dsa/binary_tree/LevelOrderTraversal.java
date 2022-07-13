package dsa.binary_tree;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(12);
        binaryTree.add(8);
        binaryTree.root.left.left = new Node(8); // to add duplicate value
        System.out.println(binaryTree.root.data);
        System.out.println(binaryTree.root.left.data);
        System.out.println(binaryTree.root.right.data);
        System.out.println(binaryTree.root.left.left.data);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = addRecursive(root.left, value);
        else if (value > root.data)
            root.right = addRecursive(root.right, value);
        else
            return root;

        return root;
    }
}