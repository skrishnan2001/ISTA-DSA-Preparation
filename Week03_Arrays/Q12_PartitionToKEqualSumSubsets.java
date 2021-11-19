package Week03_Arrays;

//TC: O(2 ^ n) | SC: O(n)

public class Q12_PartitionToKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % k != 0)
            return false;

        boolean visited[] = new boolean[nums.length];
        return solve(nums, k, 0, sum / k, visited, 0);
    }

    boolean solve(int[] nums, int k, int currSum, int target, boolean[] visited, int start) {
        if (k == 1)
            return true;
        if (currSum > target)
            return false;

        if (currSum == target)
            return solve(nums, k - 1, 0, target, visited, 0);

        for (int i = start; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (solve(nums, k, currSum + nums[i], target, visited, i + 1))
                    return true;
                visited[i] = false;
            }
        }
        return false;
    }
}
