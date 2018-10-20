

import java.util.ArrayList;
import java.util.List;

public class ExtraCreditAssignment5 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int row = matrix.length - 1, col = matrix[0].length - 1;
        int curRow = 0, curCol = 0;
        while (curRow <= row && curCol <= col) {
            // top
            for (int i = curCol; i <= col; i++) {
                res.add(matrix[curRow][i]);
            }
            curRow++;
            // right
            for (int i = curRow; i <= row; i++) {
                res.add(matrix[i][col]);
            }
            col--;
            if (curRow <= row && curCol <= col) {
                // bottom
                for (int i = col; i >= curCol; i--) {
                    res.add(matrix[row][i]);
                }
                row--;
                // left
                for (int i = row; i >= curRow; i--) {
                    res.add(matrix[i][curCol]);
                }
                curCol++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        System.out.println(spiralOrder(matrix));
    }
}
