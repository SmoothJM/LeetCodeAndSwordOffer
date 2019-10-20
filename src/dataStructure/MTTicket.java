package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class MTTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            int price = Integer.parseInt(sc.nextLine());
            if(price==0){
                break;
            }
            String[] seq = sc.nextLine().split(" ");
            int[] tickets = new int[seq.length - 1];
            if (Integer.parseInt(seq[0]) != seq.length - 1 ||(Integer.parseInt(seq[0])<1 || Integer.parseInt(seq[0])>20)) {
                System.out.println("Impossible");
                break;
            }
            for (int i = 0; i < tickets.length; i++) {
                tickets[i] = Integer.parseInt(seq[i + 1]);
                if(tickets[i]<1 || tickets[i]>1000){
                    System.out.println("Impossible");
                    System.exit(1);
                }
            }
            tickets = sort(tickets);
//            System.out.println(Arrays.toString(tickets));
            int currPrice = price;
            int minCount = Integer.MAX_VALUE;
            for (int i = 0; i < tickets.length; i++) {
                currPrice = price;
                count=0;
                for (int j = i; j < tickets.length; j++) {
                    int num = currPrice / tickets[j];
                    currPrice = currPrice % tickets[j];
                    count += num;
                }
                if(count<minCount){
                    minCount = count;
                }
            }

            if (currPrice != 0) {
                System.out.println("Impossible");
            } else {
                System.out.println(minCount);
            }

        }
    }

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
                if (arr[i] != max) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr;
    }
}
