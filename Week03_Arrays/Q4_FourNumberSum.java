package Week03_Arrays;

import java.util.*;

//TC: O(n^3) | SC: O(n^2)

public class Q4_FourNumberSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        if (n < 4)
            return ans;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i - 1] == arr[i])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j - 1] == arr[j])
                    continue;
                int start = j + 1, end = n - 1;
                while (start < end) {
                    int currSum = arr[i] + arr[j] + arr[start] + arr[end];

                    if (currSum == k) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[start]);
                        quad.add(arr[end]);
                        ans.add(quad);

                        while (start < end && arr[start] == arr[start + 1])
                            start++;
                        while (start < end && arr[end] == arr[end - 1])
                            end--;

                        start++;
                        end--;
                    }

                    else if (currSum < k)
                        start++;

                    else
                        end--;
                }
            }
        }
        return ans;
    }
}
