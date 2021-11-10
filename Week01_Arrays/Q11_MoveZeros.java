package Week01_Arrays;

//TC: O(n) ; SC : O(1)
public class Q11_MoveZeros {
    public void moveZeroes(int[] nums) {
        int startPointer = 0;
        for (int element : nums) {
            if (element != 0)
                nums[startPointer++] = element;
        }

        for (int i = startPointer; i < nums.length; i++)
            nums[i] = 0;
    }
}
