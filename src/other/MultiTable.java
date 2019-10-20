package other;

import java.util.Arrays;
import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String para = sc.nextLine();
        if(para.isEmpty()){System.exit(1);}
        String[] paras = para.split(" ");
        int row = Integer.parseInt(paras[0]);
        int col = Integer.parseInt(paras[1]);
        int k = Integer.parseInt(paras[2]);
        if(k>row*col){return;}
        long[] result = new long[k+1];
        result[0] = 1;
        int l = 0;
        long temp=0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                int multi = i*j;
                if(l<k){result[l++]=multi;}
            }
        }
        int m=0;
        for(int i=1;i<result.length;i++){
            temp = result[i];
            m=i-1;
//            if(m==k-1){
//                System.out.println(result[m]);
//                break;
//            }
            while(m>=0 && result[m]>temp) {
                result[m+1] = result[m];
                m--;
            }
            result[m+1] = temp;

        }

        System.out.println(result[k-1]);
    }


}
