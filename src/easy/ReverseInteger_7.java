package easy;

public class ReverseInteger_7 {

    public static void main(String[] args) {
        int num = reverse(1525415972);
        System.out.println(num);
    }

    public static int reverse(int x) {
        String num ="";
        boolean flag=false;
        if(x>0){
            num = x+"";
        }else{
            num = -x+"";
            flag=true;
        }
        num = new StringBuffer(num).reverse()+"";
        try{
            if(flag){
                return -Integer.parseInt(num);
            }
            return Integer.parseInt(num);
        }catch(NumberFormatException e){
            return 0;
        }
    }
}
