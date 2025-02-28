
import java.util.LinkedList;

class BT_to_LL {

    public static void main(String args[]) {

    }

    public static void flatten(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> ans = new LinkedList<Node>();
        preorderInsert(root, ans);
        Node cur = ans.poll();
        while (!ans.isEmpty()) {
            cur.left = null;
            cur.right = ans.poll();
            cur = cur.right;
        }
    }

    public static void preorderInsert(Node root, LinkedList<Node> ans) {
        if (root == null) {
            return;
        }
        ans.add(root);
        preorderInsert(root.left, ans);
        preorderInsert(root.right, ans);
    }
}
