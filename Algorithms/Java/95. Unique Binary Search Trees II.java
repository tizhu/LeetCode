/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);        
    }

    public List<TreeNode> helper(int min, int max){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (min>max) return res;
        for (int i=min;i<=max;i++){
            List<TreeNode> leftSide = helper(min,i-1);
            List<TreeNode> righSide = helper(i+1,max);
            if (leftSide.size() == 0 && righSide.size()==0){
                TreeNode root = new TreeNode(i);
                res.add(root);
            }
            else if (leftSide.size() == 0){
                for (TreeNode right: righSide){
                    TreeNode root = new TreeNode(i);
                    root.right = right;
                    res.add(root);}
                }
            else if (righSide.size()==0){
                    for (TreeNode left: leftSide){
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        res.add(root);}
                    }
            else {
                        for (TreeNode left: leftSide){
                            for (TreeNode right: righSide){
                                TreeNode root = new TreeNode(i);
                                root.left=left;
                                root.right=right;
                                res.add(root);
                            }
                        }                   
                
            }
        }
        return res;
    }    
    
}