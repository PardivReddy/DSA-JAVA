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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode root=new TreeNode(preorder[0]);
        stack.push(root);
        int inorderidx=0;
        for(int i=1;i<preorder.length;i++){
            TreeNode node=stack.peek();
            TreeNode curr=new TreeNode(preorder[i]);
            if(node.val!=inorder[inorderidx]){
                node.left=curr;
                stack.push(curr);

            }else{
                while(!stack.isEmpty() && stack.peek().val==inorder[inorderidx]){
                    node=stack.pop();
                    inorderidx++;

                }
                node.right=curr;
                stack.push(curr);
            }
        }
        return root;
    }
}