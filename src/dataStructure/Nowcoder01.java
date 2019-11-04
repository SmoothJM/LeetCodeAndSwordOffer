package dataStructure;

import java.util.Scanner;

public class Nowcoder01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0){
            String input = sc.nextLine();
            System.out.println(transform(input));
            t--;
        }
    }


    public static String transform(String s){
        char last = s.charAt(s.length()-1);
        if(last<97) return s;
        last = Character.toUpperCase(last);
        s = s.substring(0,s.length()-1);
        s += last;
        return s;
    }
}
