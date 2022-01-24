class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        n = len(word)
        
        if n == 1:
            return True
        # Case - 01: All Caps
        if word[0].isupper() and word[1].isupper():
            for i in range(2, n):
                if not word[i].isupper():
                    return False
        # Case - 02 and 03:
        else:
            for i in range(1, n):
                if word[i].isupper():
                    return False
        return True
            
