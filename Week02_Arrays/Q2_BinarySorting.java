package Week02_Arrays;
//TC: O(n) (one pass) | SC: O(1)

public class Q2_BinarySorting {
    static void binSort(int A[], int N)
    {
        int start = 0, end = N - 1;
        while(start < end)
        {
            while(A[start] == 0 && start < end)
                start++;
            
            while(A[end] == 1 && start < end)
                end--;
                
            if(start < end)
            {
                A[start++] = 0;
                A[end--] = 1;
            }
        }
    } 
}
