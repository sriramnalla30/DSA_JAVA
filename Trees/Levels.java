import java.util.*;
class Levels {

    // Method to construct the tree from the array
    public TreeNode buildTree(String[] s) {
        if (s.length == 0 || s[0].equals("-1")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (i < s.length && !s[i].equals("-1")) {
                cur.left = new TreeNode(Integer.parseInt(s[i]));
                q.add(cur.left);
            }
            i++;

            if (i < s.length && !s[i].equals("-1")) {
                cur.right = new TreeNode(Integer.parseInt(s[i]));
                q.add(cur.right);
            }
            i++;
        }

        return root;
    }

    // Method to calculate the max depth of the tree
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                TreeNode cur = q.poll();
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split("\\s+");

        Levels sol = new Levels();
        TreeNode root = sol.buildTree(arr);
        int res = sol.maxDepth(root);

        System.out.print(res);
    }
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
