package Week02_Arrays;

//TC: O(n) | SC: O(n)
public class Q14_ProductExceptSelf {
    public static long[] productExceptSelf(int arr[], int n) {
        long ans[] = new long[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++)
            ans[i] = ans[i - 1] * arr[i - 1];
        long r = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= r;
            r *= arr[i];
        }
        return ans;
    }
}
