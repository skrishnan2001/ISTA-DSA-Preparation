package Week02_Arrays;
import java.util.*;

//TC: O(n log k) | SC: O(k)

public class Q9_KLargestElements {
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < k; i++)
            minHeap.add(arr[i]);
            
        for(int i = k; i < n; i++)
        {
            if(arr[i] > minHeap.peek())
            {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        
        while(minHeap.size() > 0)
            ans.add(minHeap.poll());
        
        Collections.reverse(ans);
        return ans;
    }
}
