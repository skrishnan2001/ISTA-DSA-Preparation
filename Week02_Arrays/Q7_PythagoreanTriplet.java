package Week02_Arrays;
import java.util.*;

//TC: O(n^2) | SC: O(n)

public class Q7_PythagoreanTriplet
{
    boolean checkTriplet(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++)
            set.add(arr[i] * arr[i]);
            
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(set.contains(arr[i] * arr[i] + arr[j] * arr[j]))
                    return true;
            }
        }
        return false;
    }
}