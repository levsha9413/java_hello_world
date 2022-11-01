package Equals;

public class Strings {
    public static void main(String[] args) {
        String x = "hello";
        String y = "hello";
        System.out.println(x==y); //это также работает с помощью string pool
        System.out.println(x.equals(y));
    }
}
