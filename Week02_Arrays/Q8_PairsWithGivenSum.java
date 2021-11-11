package Week02_Arrays;
import java.util.*;

//TC: O(N Log N) | SC: O(N), , where N is the number of elements in array A 

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

public class Q8_PairsWithGivenSum {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Set<Long> set = new HashSet<>();
        List<long[]> pairSums = new ArrayList<>();
        
        for(long num : A)
            set.add(num);
            
        for(long num : B)
        {
            if(set.contains(X - num))
                pairSums.add(new long[] {X - num, num});
        }
        
        Collections.sort(pairSums, (a, b) -> Long.compare(a[0], b[0]));
        pair[] ans = new pair[pairSums.size()];
        
        for(int i = 0; i < pairSums.size(); i++)
            ans[i] = new pair(pairSums.get(i)[0], pairSums.get(i)[1]);
           
        return ans;
        }
}
