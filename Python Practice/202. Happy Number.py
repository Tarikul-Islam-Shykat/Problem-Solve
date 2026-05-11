class Solution(object):
    def isHappy(self, n):
        seen = set()

        while n != 1 and n not in seen :
            seen.add(n)
            
            sum = 0 
            for digit in str(n):
                sum += int(digit) ** 2
            
            n = sum
        
        return n == 1
        
