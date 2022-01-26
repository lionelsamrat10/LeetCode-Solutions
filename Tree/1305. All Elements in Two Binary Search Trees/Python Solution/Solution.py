# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        solution = []
        def inorder(root):
            if not root:
                return
            inorder(root.left)
            solution.append(root.val)
            inorder(root.right)
        inorder(root1)
        inorder(root2)
        return sorted(solution)
