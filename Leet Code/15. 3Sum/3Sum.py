class Solution(object):
    def threeSum(self, nums):
        res = []
        nums.sort()
        for index, num in enumerate(nums):
            if index > 0 and num == nums[index-1]:
                continue
            
            l,r = index+1, len(nums)-1
            while l<r:
                threeSum = num + nums[l] + nums[r]
                if threeSum > 0: 
                    r-=1 
                elif threeSum < 0 :
                    l+=1
                else:
                    res.append([num,nums[l],nums[r]])
                    l +=1
                    while nums[l] == nums[l-1] and l<r:
                        l+=1
        return res
