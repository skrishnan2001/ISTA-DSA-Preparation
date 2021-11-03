package Arrays;

//TC: O(n); SC: O(1)
public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        else if (n == 2)
            return Math.max(nums[0], nums[1]);

        int prevPrev = nums[0];
        int prev = Math.max(nums[0], nums[1]);
        int bestSolutionTillNow = 0;
        for (int i = 2; i < n; i++) {
            bestSolutionTillNow = Math.max(prevPrev + nums[i], prev);
            prevPrev = prev;
            prev = bestSolutionTillNow;
        }

        return bestSolutionTillNow;
    }
}
