package offer;

import java.util.Arrays;

public class PathInMatrix_12 {
    public static void main(String[] args) {
        String[] s = "abtgcfcsjdeh".split("");
        System.out.println(hasPath(s, 3, 4, "bfce"));
//        boolean[] flags = new boolean[20];
//        System.out.println(Arrays.toString(s));

    }

    public static boolean hasPath(String[] matrix, int rows, int cols, String str) {
        if (matrix == null || str == null || rows < 0 || cols < 0) return false;
        boolean[] flags = new boolean[matrix.length];
        int pathLength = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                 if(each(matrix, rows, cols, i, j, str, pathLength, flags)){
                     return true;
                 }
            }
        }
        return false;
    }

    public static boolean each(String[] matrix, int rows, int cols, int row, int col, String str, int pathLength, boolean[] flags) {
        int index = row * cols + col;
        if (row < 0 || row >= rows || col < 0 || col >= cols || flags[index] || !matrix[index].equals(str.charAt(pathLength) + ""))
            return false;
        if(pathLength == str.length()-1) return true;
        flags[index] = true;
        boolean gotIt = false;
        gotIt = each(matrix,rows,cols,row-1,col,str,pathLength+1,flags) ||
                each(matrix,rows,cols,row+1,col,str,pathLength+1,flags) ||
                each(matrix,rows,cols,row,col-1,str,pathLength+1,flags) ||
                each(matrix,rows,cols,row,col+1,str,pathLength+1,flags);
        if(!gotIt){
            flags[index] = false;
        }

        return gotIt;
    }

}
