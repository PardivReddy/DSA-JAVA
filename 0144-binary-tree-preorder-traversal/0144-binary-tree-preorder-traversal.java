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
 *///root ->left->right
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        List<Integer> list=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr=stack.pop();
              list.add(curr.val);
            if(curr.right!=null){
                stack.push(curr.right);
            }
            if(curr.left!=null){
                stack.push(curr.left);
            }
          
        }
        return list;
    }
}