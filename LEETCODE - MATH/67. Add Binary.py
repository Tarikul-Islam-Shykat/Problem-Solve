class Solution(object):
    def addBinary(self, a, b):
        carry = 0
        result  = ""

        i = len(a) -1
        j = len(b) -1; 

        while i >= 0 or j >=0 or carry : 
            total = carry
            if i>= 0 : 
                total = total + int(a[i])
                i = i -1
            if j>= 0 : 
                total = total + int(b[j])
                j = j -1
            
            bit = str(total % 2)
            result = bit + result
            carry = total // 2
        return result
            
        
