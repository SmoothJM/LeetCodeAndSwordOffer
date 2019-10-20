package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;

public class QiAnXin01 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,1,1};
//        int[] a2 = new int[]{1,2,3,4,5};
//        int[] a3 = new int[]{3,1,7,2};
//        int[] a4 = new int[]{5,3,1};
//        int[] a5 = new int[]{5,1,5,4,3,2};
        System.out.println(method(a1));
//        System.out.println(method(a2));
//        System.out.println();method(a3);
//        System.out.println(method(a4));
//        System.out.println(method(a5));
    }

    public static int method(int[] arr){
        if(arr==null || arr.length==0){return -1;}
        int sum=0;
        int incre=1;
        int desce=1;
//        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=list.size()>0?list.get(list.size()-1)+1:0;j<i;j++){
                if(arr[j]<=arr[j+1]){
//                    incre++;
                }else{
                    list.add(j);
//                    incre=1;
                }
            }
//            for(int k=i;k<arr.length-1;k++){
//                if(arr[k]>arr[k+1]){
//                    desce++;
//                }else{
//                    break;
//                }
//            }
//            sum = sum+100 * (incre>desce?incre:desce);

            incre=1;
            desce=1;
        }

        if(list.size()==0){
            System.out.println("-");
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(arr[list.get(i)]+" ");
        }
        return sum;
    }

}
