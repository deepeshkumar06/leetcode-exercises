class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        
        original = x
        rev = 0
        
        while original > 0:
            rem = original % 10
            rev = rev * 10 + rem
            original //= 10
        
        return rev == x
