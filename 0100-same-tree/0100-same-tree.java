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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            System.out.println("empty");
            return true;
        }
        if(p==null || q==null){
            System.out.println("empty");
            return false;
        }
        Queue<TreeNode>a=new LinkedList<>();
        Queue<TreeNode>b=new LinkedList<>();

        a.offer(p);
        b.offer(q);
        while(!a.isEmpty() && !b.isEmpty()){
            int sz=a.size();
            TreeNode nodea=a.poll();
            TreeNode nodeb=b.poll();
               if(nodea.val !=nodeb.val){
                return false;
               }
               if(nodea.left!=null && nodeb.left!=null){
                a.offer(nodea.left);
                b.offer(nodeb.left);
               }
               else if(nodea.left!=null ||  nodeb.left!=null){
                return false;
               }
               if(nodea.right!=null && nodeb.right!=null){
                a.offer(nodea.right);
                b.offer(nodeb.right);
               }else if(nodea.right!=null ||  nodeb.right!=null){
                return false;
               }
            }
        return true;
    }
}