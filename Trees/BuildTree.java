
import java.util.*;

class BuildTree {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Node buildTree(String[] s) {
        if (s.length == 0 || s[0].equals("N")) {
            return null;
        }
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            Node cur = q.poll();
            String cval = s[i];
            if (!cval.equals("N")) {
                cur.left = new Node(Integer.parseInt(cval));
                q.add(cur.left);
            }
            i++;
            if (i >= s.length) {
                break;
            }
            if (!cval.equals("N")) {
                cur.right = new Node(Integer.parseInt(s[i]));
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print("->" + root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print("->" + root.val);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print("->" + root.val);
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6", "7"};
        Node root = buildTree(arr);
        System.err.println("PreOrder");
        preOrder(root);
        System.err.println("\nInOrder");
        inOrder(root);
        System.err.println("\nPostOrder");
        postOrder(root);
    }

}
