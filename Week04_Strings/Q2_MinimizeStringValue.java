package Week04_Strings;
import java.util.*;

//TC: O(|S|) | SC: O(1) -> Both the array and priority queue can have at most 26 elements

public class Q2_MinimizeStringValue {
    int minValue(String S,int K) {
        int freq[] = new int[26];
        
        for(char ch : S.toCharArray())
            freq[ch - 97]++;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int f : freq)
        {
            if(f > 0)
                maxHeap.add(f);
        }
        
        while(K-- > 0 && !maxHeap.isEmpty())
        {
            int top = maxHeap.poll();
            top--;
            if(top > 0)
                maxHeap.add(top);
        }
        
        int value = 0;
        while(!maxHeap.isEmpty())
        {
            int currVal = maxHeap.poll();
            value += currVal * currVal;
        }
        return value;
    }
}
