package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q6_LargestSubarrayOfZerosAndOnes {
    int maxLen(int[] arr, int N) {
        int maxLen = 0, runningSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < N; i++) {

            runningSum += (arr[i] == 0 ? -1 : 1);

            if (map.containsKey(runningSum))
                maxLen = Math.max(maxLen, i - map.get(runningSum));
            else
                map.put(runningSum, i);
        }
        return maxLen;
    }
}
