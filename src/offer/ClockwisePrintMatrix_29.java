package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class ClockwisePrintMatrix_29 {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16}};

        int[][] m2 = {{1, 2, 3, 4, 6},
                      {5, 6, 7, 8, 7},
                      {9, 10, 11, 12, 23},
                      {13, 14, 15, 16, 55}};
        System.out.println(Arrays.toString(printMatrix(m1).toArray()));
        System.out.println(Arrays.toString(printMatrix(m2).toArray()));
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int cols = matrix[0].length;
        int rows = matrix.length;
        int start = 0;
        while (cols > start * 2 && rows > start * 2) {
            int x = cols - 1 - start;
            int y = rows - 1 - start;
            for (int i = start; i <= x; i++) {
                list.add(matrix[start][i]);
            }
            if (start < y) {
                for (int i = start + 1; i <= y; i++) {
                    list.add(matrix[i][x]);
                }
            }

            if (start < x && start < y) {
                for (int i = x - 1; i >= start; i--) {
                    list.add(matrix[y][i]);
                }
            }
            if (start < x && start < y - 1) {
                for (int i = y - 1; i > start; i--) {
                    list.add(matrix[i][start]);
                }
            }
            start++;

        }
        return list;
    }


    /**
     * int cols = matrix[0].length;
     *         int rows = matrix.length;
     *         if (matrix==null || cols<=0 || rows<=0) return null;
     *         int start = 0;
     *         while(cols>start*2 && rows>start*2){
     *             int endX = cols-1-start;
     *             int endY = rows-1-start;
     *             for (int i = start; i <= endX; i++) {
     *                 list.add(matrix[start][i]);
     *             }
     *             if(start<endY){
     *                 for (int i = start+1; i <= endY; i++) {
     *                     list.add(matrix[i][endX]);
     *                 }
     *             }
     *             if(start<endX && start<endY){
     *                 for (int i = endX-1; i >= start; i--) {
     *                     list.add(matrix[endY][i]);
     *                 }
     *             }
     *             if(start<endX && start<endY-1){
     *                 for (int i = endY-1; i > start; i--) {
     *                     list.add(matrix[i][start]);
     *                 }
     *             }
     *             start++;
     *         }
     */
}
