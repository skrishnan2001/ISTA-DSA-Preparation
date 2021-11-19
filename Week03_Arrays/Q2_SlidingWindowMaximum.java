package Week03_Arrays;
import java.util.*;

//TC: O(n) | SC: O(k)

public class Q2_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int i = 0;
        
        for(i = 0; i < k; i++)
        {
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        
        
        for(i = k; i < n; i++)
        {
            ans[i - k] = nums[dq.peekFirst()];
            
            while(!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.removeFirst();
            
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.removeLast();
            
            dq.addLast(i);
        }
        ans[n - k] = nums[dq.peekFirst()];
        return ans;
    }
}
