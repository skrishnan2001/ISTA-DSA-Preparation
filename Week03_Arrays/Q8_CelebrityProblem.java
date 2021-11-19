package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q8_CelebrityProblem {
    int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++)
            st.push(i);

        while (st.size() > 1) {
            int first = st.pop();
            int second = st.pop();
            if (M[first][second] == 1)
                st.push(second);
            else
                st.push(first);
        }

        int possibleCelebrity = st.pop();
        for (int i = 0; i < n; i++) {
            if (i == possibleCelebrity)
                continue;

            if (M[i][possibleCelebrity] == 0 || M[possibleCelebrity][i] == 1)
                return -1;
        }
        return possibleCelebrity;
    }
}
