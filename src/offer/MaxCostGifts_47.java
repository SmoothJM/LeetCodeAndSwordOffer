package offer;

public class MaxCostGifts_47 {
    public static void main(String[] args) {
        int[][] gifts= {{1,10,3,8},
                {12,2,9,6},
                {5,7,4,11},
                {3,7,16,5}};
        System.out.println(solution2(gifts));
    }

    /**
     * 2-D helper array
     * @param nums
     * @return
     */
    public static int solution(int[][] nums){
        if(nums==null || nums.length<=0 || nums[0].length<=0) return 0;
        int rows = nums.length;
        int cols = nums[0].length;
        int[][] maxVal = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int down = 0;
                int right = 0;
                if(i>0) down = maxVal[i-1][j];
                if(j>0) right = maxVal[i][j-1];
                maxVal[i][j] = Math.max(down,right)+nums[i][j];
            }
        }
        return maxVal[rows-1][cols-1];
    }
    /**
     * 1-D helper array
     * @param nums
     * @return
     */
    public static int solution2(int[][] nums){
        if(nums==null || nums.length<=0 || nums[0].length<=0) return 0;
        int rows = nums.length;
        int cols = nums[0].length;
        int[] maxVal = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int down = 0;
                int right = 0;
                if(i>0) down = maxVal[j];
                if(j>0) right = maxVal[j-1];
                maxVal[j] = Math.max(down,right)+nums[i][j];
            }
        }
        return maxVal[cols-1];
    }

}
