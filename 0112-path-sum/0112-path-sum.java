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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Queue<TreeNode>q=new LinkedList<>();
        Queue<Integer> qSum = new LinkedList<>();

        q.offer(root);
        qSum.offer(root.val);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int currSum = qSum.poll();
            if(node.left==null && node.right==null && currSum==targetSum){
                return true;
            }
            if(node.left!=null){
                q.offer(node.left);
                qSum.offer(currSum+node.left.val);

            }
            if(node.right!=null){
                q.offer(node.right);
                qSum.offer(currSum+node.right.val);

            }
        }
        return false;
    }
}