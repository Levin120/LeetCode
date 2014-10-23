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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        in(res, root);
        return res;
    }
    public void in(ArrayList<Integer> res, TreeNode root) {
        if(root.left != null)
            in(res,root.left);
        res.add(root.val);
        if(root.right != null)
            in(res,root.right);
    }
}
