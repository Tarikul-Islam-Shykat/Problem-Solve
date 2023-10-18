class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total_sum = sum(nums)
        left_sum = 0
        for i in range(len(nums)):
            result = total_sum - left_sum - nums[i]
            if result == left_sum:
                return i
            left_sum += nums[i]

        return -1
        
