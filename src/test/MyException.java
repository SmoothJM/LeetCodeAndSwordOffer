package test;

public class MyException extends Exception{
    public MyException(){
        System.out.println("Non-para constructor. You got it.");
    }
    public MyException(String s){
        super();
        System.out.println("This is para constructor. The ERROR is: "+s);
    }
}
