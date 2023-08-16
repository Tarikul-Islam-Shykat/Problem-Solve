class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSub = nums[0]
        current_sum = 0
        for n in nums : 
            if current_sum < 0:
                current_sum = 0
            current_sum = current_sum + n
            maxSub = max(maxSub, current_sum)
        return maxSub
