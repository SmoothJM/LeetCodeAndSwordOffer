package dataStructure;

import java.text.DateFormat;
import java.util.*;

public class Tencent {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        boolean flag = false;
        if ((year % 3200 == 0 && year % 172800 == 0)
                || (year<3200 && year % 100 != 0 && year % 4 == 0)
                || (year<3200 && year % 100 == 0 && year % 400 == 0)
        ) {
            flag = true;
        }
        if (month != 2) {
            if (day > map.get(month)) {
                day = day - map.get(month);
                month++;
                if (month > 12) {
                    year++;
                }
            }
        } else {
            if (flag) {
                if (day > (map.get(month) + 1)) {
                    day = day - (map.get(month) + 1);
                    month++;
                }
            } else {
                if (day > map.get(month)) {
                    day = day - map.get(month);
                    month++;
                }
            }
        }
        System.out.printf("%d-%02d-%02d",year,month,day);
    }
}
