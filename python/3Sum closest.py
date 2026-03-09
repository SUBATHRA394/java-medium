class Solution(object):
    def threeSumClosest(self, nums, target):
        # Sort the array to use the two-pointer approach
        nums.sort()
        closest_sum = float('inf')
        for i in range(len(nums) - 2):
            left, right = i + 1, len(nums) - 1
            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]
                # Check if this sum is closer to the target than previous best
                if abs(target - current_sum) < abs(target - closest_sum):
                    closest_sum = current_sum
                if current_sum < target:
                    left += 1  # Need a larger sum
                elif current_sum > target:
                    right -= 1 # Need a smaller sum
                else:
                    # Found exact match
                    return current_sum  
        return closest_sum
