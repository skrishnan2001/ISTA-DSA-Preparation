package Week03_Arrays;

import java.util.*;

//TC: O(n log n) | SC: O(1)

public class Q13_SumNearestToZero {
    public static int closestToZero(int arr[], int n) {
        if (n == 1)
            return -1;

        Arrays.sort(arr);

        int left = 0, right = n - 1;
        int sum, minSum = Integer.MAX_VALUE;

        while (left < right) {
            sum = arr[left] + arr[right];

            if (sum == 0)
                return 0;
            else if (sum < 0)
                left++;
            else
                right--;

            if (Math.abs(sum) < Math.abs(minSum))
                minSum = sum;
            else if (Math.abs(sum) == Math.abs(minSum))
                minSum = Math.max(sum, minSum);
        }

        return minSum;
    }
}
