// TC: O(n); SC: O(1)

package Week01_Arrays;

class Q3_RemoveElements {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        for(int element : nums)
        {
            if(element != val)
                nums[start++] = element;
        }
        return start;
    }
}