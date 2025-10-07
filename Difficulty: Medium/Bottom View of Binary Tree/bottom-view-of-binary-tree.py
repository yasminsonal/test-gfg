'''
class Node:
    def __init__(self, val):
        self.data = val
        self.right = None
        self.left = None
'''

class Solution:
    def bottomView(self, root):
        # code here
        from operator import itemgetter
        left = []
        right = []
        
        def dfs(node, offset, depth):
            if node is None:
                return
            if offset <= 0:
                i = -offset
                arr = left
            else:
                i = offset - 1
                arr = right
            if len(arr) == i:
                arr.append((node.data, depth))
            elif arr[i][1] <= depth:
                arr[i] = (node.data, depth)
            dfs(node.left, offset - 1, depth + 1)
            dfs(node.right, offset + 1, depth + 1)
        
        dfs(root, 0, 0)
        view = list(map(itemgetter(0), reversed(left)))
        view.extend(map(itemgetter(0), right))
        return view
        