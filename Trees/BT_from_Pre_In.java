
import java.util.*;

class BT_from_Pre_In {

    public static void main(String[] args) {
        int preorder[] = {3, 9, 20, 15, 7};
        int inorder[] = {9, 3, 15, 20, 7};
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        Node root = check(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
        printRoot(root);
    }

    public static Node check(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        Node root = new Node(preorder[preStart]);
        int rootVal = inMap.get(root.val);
        int diff = rootVal - inStart;
        root.left = check(preorder, preStart + 1, preEnd, inorder, inStart, inStart + diff - 1, inMap);
        root.right = check(preorder, preStart + diff + 1, preEnd, inorder, rootVal + 1, inEnd, inMap);
        return root;
    }

    public static void printRoot(Node root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        List<String> result = new ArrayList<>(); // Store values as strings

        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node != null) {
                result.add(String.valueOf(node.val)); // Add value
                q.add(node.left); // Add left child even if null
                q.add(node.right); // Add right child even if null
            } else {
                result.add("null"); // Add null for missing nodes
            }
        }

        // Remove trailing "null" values to match expected output format
        int i = result.size() - 1;
        while (i >= 0 && result.get(i).equals("null")) {
            result.remove(i);
            i--;
        }

        System.out.println(result);
    }

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
