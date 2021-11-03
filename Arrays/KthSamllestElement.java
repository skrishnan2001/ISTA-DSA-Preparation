package Arrays;

import java.util.*;

//TC: O(nlogk); SC: O(k)

public class KthSamllestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = l; i < k; i++)
            maxHeap.add(arr[i]);
            
        for(int i = k; i <= r; i++)
        {
            if(arr[i] < maxHeap.peek())
            {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.peek();
    } 
}
