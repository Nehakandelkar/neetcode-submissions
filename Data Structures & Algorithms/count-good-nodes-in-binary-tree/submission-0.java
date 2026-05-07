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
    public int goodNodes(TreeNode root) {
        
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int maxSoFar){
        if(node == null) return 0;

        int count = 0;

        //current node is good
        if(node.val >= maxSoFar){
            count = 1;
        }

        //update max for children
        maxSoFar = Math.max(node.val, maxSoFar);

        //count from left + right
        count = count + dfs(node.left, maxSoFar);
        count = count + dfs(node.right, maxSoFar);

        return count;

    }
}