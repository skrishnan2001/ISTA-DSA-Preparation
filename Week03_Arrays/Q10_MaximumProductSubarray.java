package Week03_Arrays;

//TC: O(n) | SC: O(1)

public class Q10_MaximumProductSubarray {
    long maxProduct(int[] arr, int n) {
        long ans = arr[0];
        long currMax = arr[0], currMin = arr[0];
        long prevMax = arr[0], prevMin = arr[0];

        for (int i = 1; i < n; i++) {
            currMax = Math.max(arr[i], Math.max(prevMax * arr[i], prevMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(prevMin * arr[i], prevMax * arr[i]));

            ans = Math.max(ans, currMax);
            prevMax = currMax;
            prevMin = currMin;
        }

        return ans;
    }
}
