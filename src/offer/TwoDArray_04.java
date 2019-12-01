package offer;

public class TwoDArray_04 {

    public static void main(String[] args) {
        int[][] arr = new int[][]
                {{1, 2, 8, 9},
                        {2, 4, 9, 12},
                        {4, 7, 10, 13},
                        {6, 8, 11, 15}};
        System.out.println(search(arr, 4));
        System.out.println(search2(arr, 4));
    }

    public static boolean search(int[][] array, int target) {
        boolean flag = false;
        if (array != null) {
            int rows = array.length;
            int cols = array[0].length;
            int row = rows - 1;
            int col = 0;
            while(col < cols && row>0){
                if(array[row][col]==target){
                    flag = true;
                    break;
                }else if(array[row][col]>target){
                    row--;
                }else{
                    col++;
                }
            }
        }


        return flag;
    }

    public static boolean search2(int[][] arr, int target){
        boolean flag = false;
        if(arr != null){
            int rows = arr.length;
            int cols = arr[0].length;
            int row = 0;
            int col = cols-1;
            while(row<rows && col>=0){
                if(arr[row][col] == target){
                    flag = true;
                    break;
                }else if(arr[row][col] > target){
                    col--;
                }else{
                    row++;
                }
            }
        }


        return flag;
    }


}
