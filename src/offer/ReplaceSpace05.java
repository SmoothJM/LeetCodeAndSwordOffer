package offer;

public class ReplaceSpace05 {
    public static void main(String[] args) {
        String s1 = " I am  Jim!  ";
        String s2 = " ";
        String s3 = null;
        String s4 = "IamJim!";

        System.out.println(replace2(s1));
        System.out.println(replace2(s2));
        System.out.println(replace2(s3));
        System.out.println(replace2(s4));
    }

    public static String replace(String str){
        if(str==null || str.length()==0){return str;}
        return str.replace(" ","%20");
    }

    public static String replace2(String str){
        if(str==null || str.length()==0){return str;}
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        if(count==0) {return str;}

        int j=str.length()+count*2-1;
        char[] c = new char[j+1];
        for(int i=str.length()-1;i>=0;i--,j--){
            if(str.charAt(i)!=' '){
                c[j] = str.charAt(i);
            }else{
                c[j--] = '0';
                c[j--] = '2';
                c[j] = '%';
            }
        }
        return String.valueOf(c);
    }
}
