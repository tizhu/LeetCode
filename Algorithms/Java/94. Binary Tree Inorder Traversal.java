import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         helper(root, res);
//         return res;        
//     }

//     public void helper(TreeNode root, List<Integer> res){
//         if (root != null){ if (root.left != null) {helper(root.left, res);}       
//         res.add(root.val);
//         if (root.right != null){
//             helper(root.right, res);
//         }
//     }
//     }
// }

class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        
        List<Integer> res = new ArrayList<>();

        TreeNode cur = root;

        Stack<TreeNode> stack = new Stack<>();
        
        while( cur!=null || !stack.isEmpty()){
            while (cur != null){                
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}