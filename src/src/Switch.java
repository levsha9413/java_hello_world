import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите возраст:");
        String age = input.nextLine();
        System.out.println(age);
        switch (age){  //переменная которая сравнивается с значениями в case
            case "10": // применяется как более лаконичная замена кучи else if
                System.out.println("Возраст = 10");
                break;// без брейк выполнится первое сработавшее сравнение и все нижестоящие
            case "20":
                System.out.println("Age = 20");
                break;
            default:  //то, что сработает если сверху не совпало ни одно условие
                System.out.println("Default ");
        }

    }
}
