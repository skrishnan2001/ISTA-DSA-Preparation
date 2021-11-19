package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(1) -> No additional auxillary space has been used apart from the o/p List

public class Q9_NextPermutation {
    static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int i, int j, int arr[]) {
        while (i < j)
            swap(i++, j--, arr);
    }

    static List<Integer> nextPermutation(int N, int arr[]) {
        List<Integer> ans = new ArrayList<>();

        if (N == 1) {
            ans.add(arr[0]);
            return ans;
        }

        int i = N - 2;

        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i >= 0) {
            int j = N - 1;
            while (arr[j] <= arr[i])
                j--;

            swap(i, j, arr);
        }

        reverse(i + 1, arr.length - 1, arr);

        for (int num : arr)
            ans.add(num);

        return ans;
    }
}
