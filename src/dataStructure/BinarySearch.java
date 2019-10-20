package dataStructure;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,12));
    }
    public static int search(int[] arr,int target){
        if(arr==null || arr.length==0){return -1;}
        int resultIndex = -1;
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
        while(left<right){
            if(target<arr[mid]){
                right=mid-1;
            }else if(target>arr[mid]){
                left=mid+1;
            }else{
                resultIndex=mid;
                break;
            }
            mid = (left + right)/2;
        }
        return resultIndex;
    }
}
