package Week02_Arrays;
//TC: O(n) (Single pass) | SC: O(1)
/*
    Dutch national flag algorithm
    a[1..Lo-1] zeroes (red)
    a[Lo..Mid-1] ones (white)
    a[Mid..Hi] unknown
    a[Hi+1..N] twos (blue)
    If the ith element is 0 then swap the element to the low range, thus shrinking the unknown range.
    Similarly, if the element is 1 then keep it as it is but shrink the unknown range.
    If the element is 2 then swap it with an element in high range.
*/
public class Q3_Sort012 {
    static void swap(int a[], int ind1, int ind2)
    {
        int temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
    
    public static void sort012(int a[], int n)
    {
        int low = 0, mid = 0, high = n - 1;
        while(mid <= high)
        {
            switch(a[mid])
            {
                case 0:
                    swap(a, low, mid);
                    low++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    swap(a, mid, high);
                    high--;
                    break;
            }
        }
    }
}
