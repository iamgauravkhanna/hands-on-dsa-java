package data_structures.tree.binary_tree;

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = addRecursive(root, value);
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(root, value);
    }

    public int findSmallestValue(Node root){
        //if no left child, return root, else return lowest value of right tree (leaf)
        return root.left == null ? root.data : findSmallestValue(root.right);
    }

    public int findLargestValue(Node root){
        //if no right child, return root, else return lowest value of right tree (leaf)
        return root.right == null ? root.data : findLargestValue(root.right);
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

    private boolean containsNodeRecursive(Node current, int value){
        if (current == null){
            return false;
        }

        if (current.data == value){
            return true;
        }

        //determine if value is on left or right side of current node
        if (value < current.data){
            return containsNodeRecursive(current.left, value);
        } else {
            return containsNodeRecursive(current.right, value);
        }
    }

    void levelOrder() {
        int h = height(root);
        int i;
        System.out.println("Height or Level :: " + h);
        for (i = 1; i <= h; i++)
            currentLevel(root, i);
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            //System.out.println("Left Height :: " + leftHeight);
            //System.out.println("Right Height :: " + rightHeight);
            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    void currentLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            currentLevel(root.left, level - 1);
            currentLevel(root.right, level - 1);
        }
    }

    void reverseLevelOrder(Node node)
    {
        int h = height(node);
        int i;
        for (i = h; i >= 1; i--)
        //THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
        {
            printLevel(node, i);
        }
    }

    /* Print nodes at a given level */
    void printLevel(Node node, int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1)
        {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }

}