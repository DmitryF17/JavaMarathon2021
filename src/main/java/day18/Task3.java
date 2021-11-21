package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers) {
            add(number, root);
        }
        dfs(root);
    }


    private static void add(int insertvalue, Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Корневой узел не может быть null");
        }
        Node nextNode = root;
        Node current = null;
        while (nextNode != null) {
            current = nextNode;
            if (insertvalue < current.getValue()) {
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }
        if (insertvalue < current.getValue()) {
            current.setLeft(new Node(insertvalue));
        } else {
            current.setRight(new Node(insertvalue));
        }
    }


    private static void dfs(Node root) {
        if (root == null)
            return;

        dfs(root.getLeft());
        System.out.print(root.getValue() + " ");
        dfs(root.getRight());

    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        Node getLeft() {
            return left;
        }

        void setLeft(Node left) {
            this.left = left;
        }

        Node getRight() {
            return right;
        }

        void setRight(Node right) {
            this.right = right;
        }
    }
}
