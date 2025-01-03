
// Node structure
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Binary Tree class
class BinaryTree {
    Node root;

    // Method to calculate the size of the tree
    int size(Node node) {
        if (node == null) {
            return 0;
        }
        // Size of tree = size of left subtree + size of right subtree + 1 (for the root)
        return size(node.left) + size(node.right) + 1;
    }

    // Wrapper for the size function
    int size() {
        return size(root);
    }

    // Main method for testing
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating a sample tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The size of the binary tree is: " + tree.size());
    }
}
