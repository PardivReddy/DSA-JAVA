/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Integer> values=new ArrayList<>();
        levelorder(root,values);
        Collections.sort(values);

        return  buildTree(values,0,values.size()-1);

    }
    public static void levelorder(TreeNode root, List<Integer> values){
        if(root==null ){
            return;

        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty() ){
            TreeNode curr=q.poll();
            values.add(curr.val);
            if(curr.left!=null ){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
    }
    public static TreeNode buildTree(List<Integer>values,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(values.get(mid));
        root.left=buildTree(values,left,mid-1);
        root.right=buildTree(values,mid+1,right);
        return root;
    }
}