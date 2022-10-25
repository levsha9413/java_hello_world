public class StringFormating {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.println("hello");//с переносом
        System.out.print("hello"); //без переноса на новую строку
        System.out.printf("hello %d %10d %s X\n", 10, 5, "hohho\n");//c форматированием
        System.out.printf(" %10d\n", 10);
        System.out.printf(" %-10d\n", 10);
        System.out.printf("%.3f", 234.1234567);

    }
}
