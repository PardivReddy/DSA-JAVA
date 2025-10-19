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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> p=new LinkedList<>();
        p.offer(root.left);
        p.offer(root.right);
        while(!p.isEmpty()){
            TreeNode left=p.poll();
            TreeNode right=p.poll();
            if(left==null && right==null){
                continue;
            }
            if(left==null || right==null || left.val!=right.val){
                return false;
            }
            p.offer(left.left);
            p.offer(right.right);
            p.offer(left.right);
            p.offer(right.left);

        }
        return true;

    }
}