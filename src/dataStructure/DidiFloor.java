package dataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DidiFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int gap = Integer.parseInt(s[1]);
        String order = sc.nextLine();
        int count = 1;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < order.length()-1; i++) {
            if(order.charAt(i)==order.charAt(i+1)){
                count++;
            }else{
                if(map.containsKey(order.charAt(i))){
                    if(count>map.get(order.charAt(i))){
                        map.put(order.charAt(i),count);
                    }
                }else{
                    map.put(order.charAt(i),count);
                }
                count=1;
            }
        }
        char maxChar = ' ';
        int maxCount = 0;
        for(Map.Entry<Character,Integer> entey: map.entrySet()){
            if(entey.getValue()>maxCount){
                maxCount = entey.getValue();
                maxChar = entey.getKey();
            }
        }
        String[] os = order.split(maxChar+"");
        System.out.println(maxChar+"");
        System.out.println(Arrays.toString(os));
    }
}
