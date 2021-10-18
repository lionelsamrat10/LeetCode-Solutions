class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: int
        """
        x=str(x)
        if int(x)<((-1)*(2**31)) or int(x)>((2**31)-1):
            return False
        else:
            if x[0]=="-":
                reverse=x[-1:0:-1]+"-"
            else:
                reverse=int(x[::-1])
            if reverse<((-1)*(2**31)) or reverse>((2**31)-1):
                return False
            else:
                print(int(x))
                print(reverse)
                if int(x)==reverse:
                    return True
