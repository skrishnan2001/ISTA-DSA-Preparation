package Week02_Arrays;
import java.util.*;

//TC: O(n^2) | SC: O(1)

public class Q13_FindThreeNumbers {
    public static boolean find3Numbers(int A[], int n, int X) {

        Arrays.sort(A);
        for (int i = 0; i < n - 2; i++) {
            int ptr1 = i + 1, ptr2 = n - 1;
            while (ptr1 < ptr2) {
                int sum = A[i] + A[ptr1] + A[ptr2];

                if (sum == X)
                    return true;

                else if (sum < X)
                    ptr1++;

                else
                    ptr2--;

            }
        }

        return false;

    }
}
