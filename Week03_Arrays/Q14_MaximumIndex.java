package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q14_MaximumIndex {
    static int maxIndexDiff(int A[], int N) {

        Queue<int[]> indexPairs = new LinkedList<>();
        indexPairs.add(new int[] { 0, N - 1 });

        while (!indexPairs.isEmpty()) {
            int pair[] = indexPairs.poll();

            if (A[pair[0]] <= A[pair[1]])
                return pair[1] - pair[0];

            if (pair[0] - 1 <= pair[1])
                indexPairs.add(new int[] { pair[0] + 1, pair[1] });

            if (pair[0] <= pair[1] - 1)
                indexPairs.add(new int[] { pair[0], pair[1] - 1 });
        }
        return -1;
    }
}
