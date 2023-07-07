package day11;

public class BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void addNode(int value) {
        root = putNode(root, value);
    }

    private Node putNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (node.value < value) {
            node.right = putNode(node.right, value);
        } else if (node.value > value) {
            node.left = putNode(node.left, value);
        }
        return node;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.value + " ");
            inOrderTraversal(node.right);
        }
    }
}
