package Contests.Week03_Contest_Arrays;
import java.util.*;

//TC: O(m * n) | SC: O(m + n)
//Problem link: https://www.hackerrank.com/challenges/matrix-rotation-algo/problem

public class Q2_MatrixLayerRotation {
    static void reverse(int oneD[], int low, int high) {
        while (low < high) {
            int temp = oneD[low];
            oneD[low] = oneD[high];
            oneD[high] = temp;
            low++;
            high--;
        }
    }

    public static void rotate(int[] oneD, int k) {
        int n = oneD.length;
        k %= n;
        reverse(oneD, 0, n - k - 1);
        reverse(oneD, n - k, n - 1);
        reverse(oneD, 0, n - 1);
    }

    static void display(List<List<Integer>> matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();
        int noOfShells = Math.min(m / 2, n / 2);

        for (int s = 1; s <= noOfShells; s++) {
            int[] oneD = fillOnedFromShell(matrix, s);
            rotate(oneD, r);
            fillShellFromOneD(matrix, oneD, s);
        }

        display(matrix, m, n);

    }

    static int[] fillOnedFromShell(List<List<Integer>> matrix, int s) {
        int minRow = s - 1, minCol = s - 1;
        int maxRow = matrix.size() - s, maxCol = matrix.get(0).size() - s;
        int size = 2 * (maxRow - minRow + maxCol - minCol);
        int oneD[] = new int[size];

        int idx = 0;
        // left wall
        for (int i = minRow; i <= maxRow; i++)
            oneD[idx++] = matrix.get(i).get(minCol);

        // bottom wall
        for (int j = minCol + 1; j <= maxCol; j++)
            oneD[idx++] = matrix.get(maxRow).get(j);

        // right wall
        for (int i = maxRow - 1; i >= minRow; i--)
            oneD[idx++] = matrix.get(i).get(maxCol);

        // top wall
        for (int j = maxCol - 1; j > minCol; j--)
            oneD[idx++] = matrix.get(minRow).get(j);
        return oneD;
    }

    static void fillShellFromOneD(List<List<Integer>> matrix, int[] oneD, int s) {
        int minRow = s - 1, minCol = s - 1;
        int maxRow = matrix.size() - s, maxCol = matrix.get(0).size() - s;

        int idx = 0;
        // left wall
        for (int i = minRow; i <= maxRow; i++)
            matrix.get(i).set(minCol, oneD[idx++]);

        // bottom wall
        for (int j = minCol + 1; j <= maxCol; j++)
            matrix.get(maxRow).set(j, oneD[idx++]);

        // right wall
        for (int i = maxRow - 1; i >= minRow; i--)
            matrix.get(i).set(maxCol, oneD[idx++]);

        // top wall
        for (int j = maxCol - 1; j > minCol; j--)
            matrix.get(minRow).set(j, oneD[idx++]);
    }
}
