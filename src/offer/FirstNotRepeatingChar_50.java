package offer;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class FirstNotRepeatingChar_50 {
    public static void main(String[] args) {
        String str = "google";
        System.out.println(solution1((str)));
        System.out.println(solution2((str)));
        System.out.println(solution3((str)));
    }

    /**
     * 空间换时间,使用排序的LinkedHashMap,所以后面可以遍历map
     * @param str
     * @return
     */
    public static int solution1(String str){
        if(str==null || str.length()<=0) return -1;
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> temp:map.entrySet()) {
            if(temp.getValue()==1){
                return str.indexOf(temp.getKey()+"");
            }
        }
        return -1;
    }

    /**
     * 暴力法On^2
     * @param str
     * @return
     */
    public static int solution2(String str){
        if(str==null || str.length()<=0) return -1;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                flag=true;
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }

    /**
     * 空间换时间,使用无序的HashMap,所以后面只能从头遍历字符串
     * @param str
     * @return
     */
    public static int solution3(String str){
        if(str==null || str.length()<=0) return -1;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.get(c)==1) return str.indexOf(c+"");
        }
        return -1;
    }
}
