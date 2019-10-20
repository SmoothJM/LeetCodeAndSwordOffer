package dataStructure;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int input = sc.nextInt();
            System.out.println(fib(input));
        }
    }
    public static int fib(int c){
        if(c==0 || c==1){
            return 1;
        }
        return fib(c-1) + fib(c-2);
    }

}


