package Week03_Arrays;

//TC: O(n^2) | SC: O(1)

public class Q3_RotateMatrixUsingConstantSpace {
    void swap2D(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    void transposeMatrix(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                swap2D(arr, i, j);
        }
    }

    void rotateMatrix(int arr[][], int n) {

        transposeMatrix(arr, n);

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = temp;
            }
        }
    }
}
