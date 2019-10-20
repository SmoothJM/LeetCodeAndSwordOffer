package offer;

public class MathPower_16 {
    public static void main(String[] args) {
        System.out.println(pow(2, -2));
    }

    public static double pow(double base, int exp) {
        double result = 1.0;
        if (base == 0 && exp <= 0) return 0;
        if (base == 0) return 0;
        if (exp == 0) return result;
        if(exp<0){
            exp = -exp;
            base = 1/base;
        }
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }
}
