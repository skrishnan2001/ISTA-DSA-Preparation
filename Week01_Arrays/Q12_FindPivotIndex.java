package Week01_Arrays;

//TC: O(n) ; SC: O(1)
public class Q12_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length, sum = 0;
        for(int number : nums)
            sum += number;
        
        int prefixSum = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(prefixSum == (sum - prefixSum - nums[i]))
                return i;
            prefixSum += nums[i];
        }
        
        return -1;
    }
}
