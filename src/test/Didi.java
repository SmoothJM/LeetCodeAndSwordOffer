package test;
import java.util.*;
public class Didi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                if(!l1.contains(s[j]) && !l2.contains(s[j])){
                    if(j==0){
                        if(l1.contains(s[(j+1)%2])){
                            l2.add(s[j]);
                        }else{
                            l1.add(s[j]);
                        }
                    }else{
                        if(l2.contains(s[(j+1)%2])){
                            l1.add(s[j]);
                        }else{
                            l2.add(s[j]);
                        }
                    }
                }
            }
        }
        int minSize = l1.size()<l2.size()?l1.size():l2.size();
        int maxSize = l1.size()>l2.size()?l1.size():l2.size();
        int last = n - l1.size()-l2.size();
        int max = last + minSize;

        if((maxSize-max)>(max*2)){
            System.out.println(maxSize/2);
        }else{
            System.out.println((max<maxSize?max:maxSize)*2);
        }


//        System.out.println(Arrays.toString(l1.toArray()));
//        System.out.println(Arrays.toString(l2.toArray()));
    }

}
