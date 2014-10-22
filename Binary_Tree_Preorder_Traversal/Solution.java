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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.empty()) {
            TreeNode cur = st.peek();
            res.add(cur.val);
            st.pop();
            if(cur.right != null)
                st.push(cur.right);
            if(cur.left != null)
                st.push(cur.left);
        }
        st = null;
        return res;
    }
}
