# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

## solution 1
class Solution:
    def sortedArrayToBST(self, nums) -> TreeNode:    
        if not nums or len(nums)==0: return None
        left,right = 0,len(nums)-1
        mid = (right+left) // 2
        
        root = TreeNode(nums[mid])
        root.left = self.sortedArrayToBST(nums[:mid])
        root.right = self.sortedArrayToBST(nums[mid+1:])
        return root



## solution 2
class Solution:
    def contructTree(self,nums, left, right) -> TreeNode:
        if left>right:return None
        mid = (left+right)//2
        current = TreeNode(nums[mid])
        current.left = self.contructTree(nums, left, mid-1)
        current.right = self.contructTree(nums, mid+1, right)
        return current   
    
    def sortedArrayToBST(self, nums: List[int]) -> TreeNode:    
        if not nums or len(nums)==0: return None
        return self.contructTree(nums,0,len(nums)-1)