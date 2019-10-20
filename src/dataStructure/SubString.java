package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s==null || s.length()==0){System.exit(1);}
        int k=0;
        String temp = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length()-1; ) {
            temp = s.substring(k,++i);
            if(list.indexOf(temp)==-1){
                list.add(temp);
            }
            if(s.charAt(k)!=s.charAt(i)){
                k=i;
            }
        }
        System.out.println(list.size());
    }
}
