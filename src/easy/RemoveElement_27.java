package easy;

public class RemoveElement_27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,2,3,3,4,5,3},3));
    }
    public static int removeElement(int[] nums, int val) {
        int resultLength = 0;
        for (int i=0; i<nums.length;i++){
            if(nums[i] != val){
                nums[resultLength] = nums[i];
                resultLength++;
            }
        }
        return resultLength;
    }
}
