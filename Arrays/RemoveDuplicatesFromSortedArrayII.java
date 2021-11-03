// TC: O(n); SC: O(1)

package Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int fast = 2, slow = 1;
        while(fast < nums.length)
        {
            if(nums[fast] == nums[slow] && nums[fast] == nums[slow - 1])
                fast++;
            else
            {
                nums[++slow] = nums[fast++];
            }
        }
        return slow + 1;// +1 for the element count. Slow denotes the last index of atmost 2-repeat array
    }
}
