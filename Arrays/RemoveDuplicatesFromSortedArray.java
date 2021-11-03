package Arrays;

// TC: O(n); SC: O(1)

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int referencePointer = 0, n = nums.length;

        if (nums == null || n == 0)
            return 0;

        for (int i = 1; i < n; i++) {
            if (nums[referencePointer] != nums[i])
                nums[++referencePointer] = nums[i];
        }
        return referencePointer + 1;// referencePointer denotes the last index. So adding 1 to get the length of the unique array
    }
}
