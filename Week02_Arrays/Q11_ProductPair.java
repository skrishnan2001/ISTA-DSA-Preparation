package Week02_Arrays;
import java.util.*;

//TC: O(n) | SC: O(n)

public class Q11_ProductPair {
    boolean isProduct(int[] arr, int n, long x) {
        Set<Long> set = new HashSet<>();
        for(int num : arr)
        {
            if(num != 0 && x % num == 0 && set.contains(x / num))
                return true;
            set.add((long)num);
        }
        return false;
    }
}
