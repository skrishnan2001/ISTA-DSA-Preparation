package Week02_Arrays;
//Using merge sort
//TC: O(n log n) | SC: O(n)

public class Q4_CountInversions {
    static long mergeAndCount(long arr[], int low, int mid, int high)
    {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;
        long left[] = new long[leftSize];
        long right[] = new long[rightSize];
        
        for(int i = 0; i < leftSize; i++)
            left[i] = arr[low + i];
            
        for(int j = 0; j < rightSize; j++)
            right[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = low;
        long swaps = 0;
        
        while(i < leftSize && j < rightSize)
        {
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
            {
                arr[k++] = right[j++];
                swaps += (leftSize - i);
            }
        }
        
        while(i < leftSize)
            arr[k++] = left[i++];
        while(j < rightSize)
            arr[k++] = right[j++];
        return swaps;
    }
    
    static long mergeSortAndCount(long arr[], int low, int high)
    {
        long count = 0;
        if(low < high)
        {
            int mid = (low + high)/2;
            count += mergeSortAndCount(arr, low, mid);
            count += mergeSortAndCount(arr, mid + 1, high);
            count += mergeAndCount(arr, low, mid, high);
        }
        return count;
    }
    
    static long inversionCount(long arr[], long N)
    {
        return mergeSortAndCount(arr, 0, (int)N - 1);
    }
}
