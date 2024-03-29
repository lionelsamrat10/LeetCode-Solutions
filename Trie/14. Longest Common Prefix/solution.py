'''
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
'''

class Node:
    def __init__(self):
        self.children = defaultdict(Node)
        self.count = 0
class Trie:
    def __init__(self):
       self.t = Node()
    def add(self,st):
        temp = self.t
        for i in st:
            temp = temp.children[i]
            temp.count += 1
        return temp.count
    def traverse(self,st,n):
        temp = self.t
        ct = 0
        if temp.count == n : ct += 1
        for i in st:
            temp = temp.children[i]
            # print(temp.count)
            if temp.count == n : ct += 1
        return ct
        
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        head = Trie()
        ans =0
        for st in strs:
            ma = head.add(st)
        ans = head.traverse(strs[0],len(strs))
        print(ans)
        return strs[0][:ans]
