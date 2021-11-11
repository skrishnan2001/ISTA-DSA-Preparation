package Week02_Arrays;
import java.util.*;
import java.io.*;

public class Q12_SortingElementsByFrequency {
    static void stringArrayToIntArray(String input[], int arr[]) {
        for (int i = 0; i < input.length; i++)
            arr[i] = Integer.parseInt(input[i]);
    }
    
    //TC: O(n log n) | SC: O(n)
    static void sortByFrequency(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<int[]> numFreq = new ArrayList<>();
        for(int num : arr)
        {
            if(!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }
        
        for(int ele : map.keySet())
            numFreq.add(new int[]{ele, map.get(ele)});
            
        Collections.sort(numFreq, (a, b) -> b[1] == a[1] ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));
        for(int[] numFreqPairs : numFreq)
        {
            while(numFreqPairs[1]-- > 0)
                System.out.print(numFreqPairs[0] + " ");
        }
        System.out.println();
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(buf.readLine());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(buf.readLine());
		    String input[] = buf.readLine().trim().split(" ");
            int arr[] = new int[n];
            stringArrayToIntArray(input, arr);
            sortByFrequency(arr);
		}
	}
}
