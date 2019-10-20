package dataStructure;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{54,12,45,22,5,12,34,12,45,22,5};
        int[] array2 = new int[]{12,13,14,22,25,26,34,100};
        System.out.println(Arrays.toString(sort(array)));
        System.out.println(Arrays.toString(sort(array2)));
    }

    public static int[] sort(int[] arr){
        long startTime=System.nanoTime();
        int temp = 0;
        boolean flag = true;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if(flag){break;}
        }
        long endTime=System.nanoTime();
        System.out.println(endTime-startTime);
        return arr;
    }

}
