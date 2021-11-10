package Week01_Arrays;
//TC : O(n) ; SC : O(1)

public class Q6_MissingNumber {
    public int missingNumber(int[] nums) {
        int l = nums.length, sum = 0;
        for (int i : nums)
            sum += i;
        return l * (l + 1) / 2 - sum;
    }
}
