package offer;

public class Singleton_02 {
    private Singleton_02(){};
    static class InnerSingleton{
        private static final Singleton_02 s = new Singleton_02();
    }
    public static Singleton_02 getSingleton(){
        return InnerSingleton.s;
    }


    public static void main(String[] args) {
        Singleton_02 s1 = Singleton_02.getSingleton();
        Singleton_02 s2 = Singleton_02.getSingleton();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

}

