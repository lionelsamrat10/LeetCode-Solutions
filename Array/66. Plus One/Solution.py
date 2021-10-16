class Solution(object):
    def plusOne(self, digits):
        strings=[str(x) for x in digits]
        string_n="".join(strings)
        int_n=int(string_n)
        int_n=int_n+1
        list_n=[int(x) for x in str(int_n)]
        return list_n
