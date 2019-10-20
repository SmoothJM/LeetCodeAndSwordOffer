package easy;

public class AddBinary_67 {
    public static void main(String[] args) {
/**
 * "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
 * "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
 */
        String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a,b));


    }
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }

}
