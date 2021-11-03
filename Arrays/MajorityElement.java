//TC: O(n) ; SC : O(n)

package Arrays;
import java.util.*;

public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int element : a)
        {
            if(!map.containsKey(element))
                map.put(element, 1);
            else
                map.put(element, map.get(element) + 1);
            
            if(map.get(element) > size/2)
                return element;
        }
        return -1;
    }
}
