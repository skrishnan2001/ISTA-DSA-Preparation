package Week02_Arrays;
import java.util.*;

//TC: O(n log n) | SC: O(1)

public class Q10_LargestNumberFromAnArray {
    String printLargest(String[] arr) {
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(String x, String y) {
                return (x + y).compareTo(y + x) > 0 ? -1 : 1;
            }
        });
        String ans = "";
        for (String num : arr)
            ans += num;
        return ans;
    }
}
