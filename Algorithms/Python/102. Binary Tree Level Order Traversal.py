# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root: return []
        res = []
        stack = [[root]]

        while stack:
            nodes = stack.pop()
            nums = []
            level = []

            for node in nodes:
                nums.append(node.val)
                
                if node.left:
                    level.append(node.left)
                if node.right:
                    level.append(node.right)
            if level:      
                stack.append(level)
                    
            res.append(nums)
            
        return res

            