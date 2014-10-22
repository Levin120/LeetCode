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
         pre(res,root);  
         return res;  
    }  
    public void pre(ArrayList<Integer> res, TreeNode root)  
     {  
         res.add(root.val);  
         if(root.left != null)  
             pre(res, root.left);  
         if(root.right != null)  
             pre(res, root.right);  
     }  
}  
