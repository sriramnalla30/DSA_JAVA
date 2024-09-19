class Node {  
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void Inorder() {
        InorderRec(root);
    }

    public void InorderRec(Node root) {
        if (root != null) {
            InorderRec(root.left);
            System.out.print(root.data + " ");
            InorderRec(root.right);
        }
    }
}