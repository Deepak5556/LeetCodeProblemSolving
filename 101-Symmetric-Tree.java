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
        if (root == null) {
            return true;
        }
        return ismirror(root.left, root.right);
    }

    public boolean ismirror(TreeNode Left, TreeNode Right) {
        if (Left == null && Right == null) {
            return true;
        } else if (Left == null || Right == null) {
            return false;
        }

        // Compare values and recursively check symmetry
        return (Left.val == Right.val) 
            && ismirror(Left.left, Right.right) 
            && ismirror(Left.right, Right.left);
    }
}
