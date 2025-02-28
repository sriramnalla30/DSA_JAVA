import java.util.*;

class BT_from_Post_In{
    public static void main(String[] args) {
        int postorder[] = {3, 9, 20, 15, 7};
        int inorder[] = {9, 3, 15, 20, 7};
        Map<Integer,Integer> inMap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        buildTree(postorder,0,postorder.length,inorder,0,inorder.length,inMap);
    }
    public static void buildTree(int[] postorder,int postStart,int postEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> inMap){
        if(postStart>postEnd || inStart>inEnd) return null;    
        TreeNode root=new TreeNode(postorder[postEnd]);
        int root_index=inMap.get(root.val);
        int diff=root_index-inStart;
        root.left=buildTree(postorder,postStart,postStart+diff-1,inorder,inStart,root_index-1,inMap);
        root.right=buildTree(postorder, postStart+diff, postEnd-1, inorder, root_index+1, inEnd, inMap);
        return root
    }
}