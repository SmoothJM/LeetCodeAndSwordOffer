package dataStructure;

import java.util.*;

public class BiliDate {
    public static void main(String[] args) {
        Map<Integer,Integer> flat = new HashMap<>();
        flat.put(1,31);
        flat.put(2,28);
        flat.put(3,31);
        flat.put(4,30);
        flat.put(5,31);
        flat.put(6,30);
        flat.put(7,31);
        flat.put(8,31);
        flat.put(9,30);
        flat.put(10,31);
        flat.put(11,30);
        flat.put(12,31);
        Scanner sc = new Scanner(System.in);
        String[] inputS = sc.nextLine().split("-");
        int year=Integer.parseInt(inputS[0]);
        int month=Integer.parseInt(inputS[1]);
        int day=Integer.parseInt(inputS[2]);
        int sum = 0;
        boolean isNonFlat = false;
        if(year%4==0){
            isNonFlat = true;
        }
        if(month<=2){
            for(int i=1; i<=month;i++){
                if(i!=month){
                    sum += flat.get(i);
                }else{
                    sum += day;
                }
            }
        }else{
            for(int i=1; i<=month;i++){
                if(i!=month){
                    if(isNonFlat){
                        if(i==2){
                            sum += flat.get(i)+1;
                        }else{
                            sum += flat.get(i);
                        }
                    }else{
                        sum += flat.get(i);
                    }
                }else{
                    sum += day;
                }
            }
        }
        System.out.println(sum);

    }
}
