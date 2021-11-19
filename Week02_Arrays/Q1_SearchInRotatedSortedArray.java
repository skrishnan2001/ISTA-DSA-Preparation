package Week02_Arrays;

//TC: O(log n) | SC: O(1)

public class Q1_SearchInRotatedSortedArray {
    int search(int A[], int l, int h, int key)
    {
        while(l <= h)
        {
            int mid = (l + h)/2;
            
            if(A[mid] == key)
                return mid;
                
            if(A[l] <= A[mid]) //Checking if the left half is sorted
            {
                if(key >= A[l] && key <= A[mid]) //Checking if the key can be present in the left half
                    h = mid - 1;
                else
                    l = mid + 1;
            }
            else //Since it's a rotated sorted array, if the left half isn't sorted, the right half will have to be sorted
            {
                if(key >= A[mid] && key <= A[h]) //Checking if the key can be present in the right half
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return -1;
    }
}
