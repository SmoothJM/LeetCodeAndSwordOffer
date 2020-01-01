package dataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuoYiNetwork {
    public static void main(String[] args) {
        int totalShiftsEachMachine = 21;
        int days = 7;
        int shiftsPerDayEachMachine=3;
        String[] ss = new String[63];
        for(int i=0;i<63;i++){
            int machine = i/21;
            int day = i%7;
            int shift = i%3;
            String s= ""+machine+day+shift;
            ss[i] = s;
        }
        System.out.println(Arrays.toString(ss));
        Set<String> set = new HashSet<>();
        for (int i = 0; i < ss.length; i++) {
            set.add(ss[i]);
        }
        System.out.println(set.size());
    }


}
