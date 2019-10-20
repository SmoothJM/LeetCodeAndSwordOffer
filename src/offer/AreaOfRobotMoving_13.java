package offer;

public class AreaOfRobotMoving_13 {
    public static void main(String[] args) {
        System.out.println(areaCount(18,40,40));
    }

    public static int areaCount(int limit,int rows,int cols){
        int count = 0;
        boolean[] flags = new boolean[rows*cols];
        return areaCore(limit,rows,cols,0,0,flags);
    }

    public static int areaCore(int limit,int rows,int cols,int row,int col,boolean[] flags){
        int count=0;
        if(check(limit,rows,cols,row,col,flags)){
            flags[row*cols+col] = true;
            count = 1+areaCore(limit,rows,cols,row-1,col,flags)+
                    areaCore(limit,rows,cols,row+1,col,flags)+
                    areaCore(limit,rows,cols,row,col-1,flags)+
                    areaCore(limit,rows,cols,row,col+1,flags);
        }
        return count;
    }

    private static boolean check(int limit, int rows, int cols, int row, int col, boolean[] flags) {
        int index = row*cols+col;
        if(row < 0 || row >= rows || col < 0 || col >= cols || flags[index] || calc(limit,row,col)){
            return false;
        }
        return true;
    }

    private static boolean calc(int limit, int row, int col) {
        int r = 0;
        int c = 0;
        while(row!=0){
            r += row%10;
            row /= 10;
        }
        while(col!=0){
            c += col%10;
            col /= 10;
        }
        if(limit>=r+c){
            return false;
        }
        return true;
    }
}
