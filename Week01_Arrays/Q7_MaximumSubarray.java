package Week01_Arrays;

//TC: O(n), SC: O(1) --> Using Kadane's Algo

public class Q7_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int localMax = nums[0], globalMax = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            localMax = Math.max(nums[i], nums[i] + localMax);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
