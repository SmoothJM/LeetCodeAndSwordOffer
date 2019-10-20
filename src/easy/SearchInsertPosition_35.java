package easy;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));//1
        System.out.println(searchInsert(new int[]{1, 3, 4, 5, 6}, 8));//5
    }

    public static int searchInsert(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//            if (nums[i] > target) {
//                return i;
//            }
//            if (i == nums.length - 1) {
//                return i + 1;
//            }
//        }
//        return 0;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

        }
        return low;


    }
}
