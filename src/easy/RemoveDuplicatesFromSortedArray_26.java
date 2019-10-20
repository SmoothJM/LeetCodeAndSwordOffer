package easy;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,2,3,5,5}));

//        int[] arr = new int[]{1,2,3,4,5};
//        System.out.println(arr[5]);
    }

    public static int removeDuplicates(int[] nums) {
        int resultLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums.length-1){
                if (nums[i] != nums[i+1]) {
                    nums[resultLen] = nums[i];
                    resultLen++;
                }
            }else{
                nums[resultLen] = nums[i];
                resultLen++;
            }
        }

        return resultLen;
    }

//    public static int removeElement(final int[] nums, final int val) {
//        int resultLen = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[resultLen] = nums[i];
//                resultLen++;
//            }
//        }
//        return resultLen;
//    }

}
