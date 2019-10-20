package dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            map.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
        double dis = 0;
        double v = 0;
        for (int i = 0; i < n; i++) {
            int[] max = findMax(map);
            map.remove(max[0]);
            dis = dis + distance(v,max[0],max[1]);
            v = speed(v,max[0],max[1]);
        }
        System.out.printf("%.1f",dis);
    }

    public static int[] findMax(Map<Integer,Integer> map){
        int[] result=new int[2];
        int maxA=0;
        int maxT=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()>maxA){
                maxA = entry.getKey();
                maxT = entry.getValue();
            }else if(entry.getKey()==maxA){
                if(entry.getValue()>maxT){
                    maxA = entry.getKey();
                    maxT = entry.getValue();
                }
            }
        }

        result[0] = maxA;
        result[1] = maxT;
        return result;

    }

    public static double distance(double v0, double a, double t){
        return v0*t + 0.5*a*t*t;
    }

    public static double speed(double v0, double a, double t){
        return v0 + a*t;
    }
}
