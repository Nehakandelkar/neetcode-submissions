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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        return compare(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean compare(TreeNode node, int minValue, int maxValue){
        if(node == null) return true;

        if(node.val <= minValue || node.val >= maxValue){
            return false;
        }

        return compare(node.left, minValue, node.val) && 
        compare(node.right, node.val, maxValue);


    }



}
