// TC: O(n); SC: O(1)

package Arrays;

class RemoveElements {
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