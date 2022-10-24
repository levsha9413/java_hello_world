import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String myString = new String("Строка создается классическим методом, как у других классов");

        //Создание объекта сканера
        Scanner scanner = new Scanner(System.in); //Scanner - класс, new - ключевое слово для создания экземпляра
        //System.in - входной поток, как аргумент конструктора

        System.out.println("Ввод");
        myString= scanner.nextLine(); // Запуск сканера, сканнер принимает символы до нажатия Enter
        System.out.println("Вы ввели:\n " + myString);
        System.out.println("Введите число");
        int myInt = scanner.nextInt(); //для приема чисел используется метод nextInt
        System.out.println("myInt: " + myInt);

    }
}
