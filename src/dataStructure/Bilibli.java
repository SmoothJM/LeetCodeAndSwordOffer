package dataStructure;

import java.util.*;

public class Bilibli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("\\+");
        String[] b = sc.nextLine().split("\\+");
        int[] ai = new int[2];
        int[] bi = new int[2];
        if((a.length==1 && a[0].equals("0")) || (b.length==1 && b[0].equals("0"))){
            System.out.println(0);
            System.exit(1);
        }
        ai[0] = Integer.parseInt(a[0]);
        bi[0] = Integer.parseInt(b[0]);
        if(a[1].substring(0,a[1].length()-1).equals("")){
            ai[1]=1;
        }else{
            ai[1]=Integer.parseInt(a[1].substring(0,a[1].length()-1));
        }
        if(b[1].substring(0,b[1].length()-1).equals("")){
            bi[1]=1;
        }else{
            bi[1]=Integer.parseInt(b[1].substring(0,b[1].length()-1));
        }
      // System.out.println(Arrays.toString(ai));System.out.println(Arrays.toString(bi));
        int i = ai[0]*bi[0] - ai[1]*bi[1];
        int j = ai[0]*bi[1] + ai[1]*bi[0];
       System.out.println(i+"+"+j+"i");


    }
}
