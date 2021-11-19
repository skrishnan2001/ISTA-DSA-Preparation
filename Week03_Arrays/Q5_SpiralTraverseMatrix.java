package Week03_Arrays;
import java.util.*;

//TC: O(r * c) | SC: O(r * c) (Since there are r * c elements in the matrix)

public class Q5_SpiralTraverseMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> ans = new ArrayList<>();
        int startRow = 0, startCol = 0, endRow = r - 1, endCol = c - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++)
                ans.add(matrix[startRow][col]);

            for (int row = startRow + 1; row <= endRow; row++)
                ans.add(matrix[row][endCol]);

            if (startRow == endRow)
                break;

            for (int col = endCol - 1; col >= startCol; col--)
                ans.add(matrix[endRow][col]);

            if (startCol == endCol)
                break;

            for (int row = endRow - 1; row > startRow; row--)
                ans.add(matrix[row][startCol]);

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}
