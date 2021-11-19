package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q1_SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int left = 0, right;
        ArrayList<Integer> ans = new ArrayList<>();
        int currSum = arr[0];
        for (right = 1; right <= n; right++) {
            while (left < right - 1 && currSum > s)
                currSum -= arr[left++];

            if (currSum == s) {
                ans.add(left + 1);
                ans.add(right);
                return ans;
            }

            if (right < n)
                currSum += arr[right];
        }

        ans.add(-1);
        return ans;
    }
}
