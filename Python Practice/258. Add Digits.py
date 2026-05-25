class Solution(object):
    def addDigits(self, num):
        while num > 9 :
            total = 0
            for digit in  str(num):
                total = total + int(digit)
                #print(total)
            num = total
        
        return num
