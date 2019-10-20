package dataStructure;


import java.util.Scanner;

public class Cisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("<");
        if (input == null || input.length == 0) {
            System.exit(1);
        }
        if (input[0] == null || input[0].length() == 0) {
            System.out.println(input[0]);
            System.exit(1);
        }

        StringBuffer alertName = new StringBuffer(input[0].replace("\"", ""));
        if (alertName.charAt(0) == '%') {
            alertName.delete(0,3);
        }
        alertName = alertName.reverse();
        if(alertName.charAt(2)=='%'){
            alertName.delete(0,3);
        }

        System.out.println(alertName.reverse().toString());
    }


}
