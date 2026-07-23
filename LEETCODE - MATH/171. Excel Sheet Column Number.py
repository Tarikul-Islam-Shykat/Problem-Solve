class Solution(object):
    def titleToNumber(self, columnTitle):
        result = columnTitle
        total = 0 
        i = 0
        for char in result  : 
            print(char)
            print(ord(char) - ord("A") + 1)
            val = ord(char) - ord("A") + 1

            if i == 0 :
                total = 0 * 26 + val 
                i = i + 1
            else : 
                total = total * 26 + val
        return total





        
