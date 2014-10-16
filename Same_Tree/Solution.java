/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if ((p == null && q != null)||(p != null && q == null))
            return false;
        else {
            if(isSameTree(p.left, q.left) == true && isSameTree(p.right, q.right) == true && p.val == q.val) 
                return true;
            else
                return false;
        }
    }
}
