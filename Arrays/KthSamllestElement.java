package Arrays;

import java.util.*;

//TC: O(nlogn); SC: O(1)

public class KthSamllestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k - 1];
    } 
}
