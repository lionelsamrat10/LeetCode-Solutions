# Q) Given a word, you need to judge whether the usage of capitals in it is right or not.
# We define the usage of capitals in a word to be right when one of the following cases holds:

# All letters in this word are capitals, like "USA".
# All letters in this word are not capitals, like "leetcode".
# Only the first letter in this word is capital, like "Google".
# Otherwise, we define that this word doesn't use capitals in a right way. 

# Example 1:

# Input: "USA"
# Output: True
 
# Example 2:

# Input: "FlaG"
# Output: False
 
# Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

# Answer in Python language ->

# created a class
class Solution:
    # this function will return a boolean value
    def detectCapitalUse(self, word: str) -> bool:
        # traverses through the string and checks if all of the letters in the string
        # are either uppercase or lowercase or if first letter is upper case and rest
        # of the letters are lowercase then it returns True else False
        return(word.isupper() or word.islower() or (word[0].isupper() and word[1:].islower()))
    
# created an object of class Solution
ob = Solution()
# calling class method and printing its output
print(ob.detectCapitalUse(input()))

