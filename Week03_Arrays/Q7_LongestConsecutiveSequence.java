package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q7_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0, currentLength = 0;
        Map<Integer, Boolean> visited = new HashMap<>();

        for (int num : nums)
            visited.put(num, false);

        for (int num : nums) {
            if (!visited.get(num)) {
                visited.put(num, true);

                int leftBound = num - 1;
                while (visited.containsKey(leftBound) && !visited.get(leftBound))
                    visited.put(leftBound--, true);

                int rightBound = num + 1;
                while (visited.containsKey(rightBound) && !visited.get(rightBound))
                    visited.put(rightBound++, true);

                currentLength = rightBound - leftBound - 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}