package offer;

public class Singleton02 {
    private Singleton02(){};
    static class InnerSingleton{
        private static final Singleton02 s = new Singleton02();
    }
    public static Singleton02 getSingleton(){
        return InnerSingleton.s;
    }


    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getSingleton();
        Singleton02 s2 = Singleton02.getSingleton();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

}

