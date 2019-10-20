package offer;

public class MinValueInRotaedArray_11 {
    public static void main(String[] args) {
        int[] nums = new int[]{6,7,1,2,3,4,5};
        int[] nums2 = new int[]{1,2,3,4,5};
        System.out.println(find(nums2));
    }

    public static int find(int[] a){
        int index = -1;
        if(a==null || a.length==0) return index;

        int low = 0;
        int high = a.length-1;
        if(a[low]<=a[high]) return 0;
        while (high-low>1){
            int mid = (low+high)/2;
            if(a[mid]>a[low]){
                low = mid;
            }else if(a[mid]<=a[high]){
                high = mid;
            }
        }
        index = high;

        return index;
    }
}
