package easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FizzBuzz_412 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz2(15).toArray()));
    }

    /**
     * multiple if statement
     * @param n
     * @return
     */
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        if(n<1) return list;
        for (int i = 1; i <=n ; i++) {
            boolean b1 = i%3==0;
            boolean b2 = i%5==0;
            if(b1 && b2) list.add("FizzBuzz");
            else if(b1) list.add("Fizz");
            else if(b2) list.add("Buzz");
            else list.add(i+"");
        }
        return list;
    }

    public static List<String> fizzBuzz2(int n) {
        List<String> list = new ArrayList<>();
        if(n<1) return list;
        for (int i = 1; i <=n ; i++) {
            list.add(i+"");
        }
        for (int i = 3; i <= n; i+=3) {
            list.set(i-1,"Fizz");
        }
        for (int i = 5; i <= n; i+=5) {
            list.set(i-1,"Buzz");
        }
        for (int i = 15; i <= n; i+=15) {
            list.set(i-1,"FizzBuzz");
        }
        return list;
    }
}
