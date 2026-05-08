class Solution(object):
    def checkPerfectNumber(self, num):
        if num <= 1:
            return False
        root  = math.sqrt(num)
        limit = int(root)
        total = 1
        for i in range (2, limit+1):
            if(num % i ==0):
                second_number = num / i
                total = total + i + second_number
        return total == num
        
