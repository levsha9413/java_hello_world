import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // достаем разделитель системы
        //File file = new File("/Users/pbochkarev/source/java/java_hello_world/src/src/TestFile");
        String path = separator + "Users" + separator + "pbochkarev" + separator + "source" + separator
                + "java" + separator + "java_hello_world" + separator + "src" + separator + "src"
                + separator + "TestFile";
        //System.out.println(path);
        File file = new File(path);
        Scanner scanner = new Scanner(file); //добавили исключение на случай если файл не найден, в сигнатуру метода main
        System.out.println(scanner.nextLine());//вывод одной строки
        while (scanner.hasNextLine()){ //вывод оставшихся строк, в цикле. При этом первая строка уже не выведется
            System.out.println(scanner.nextLine());
        }
        scanner.close(); //обязательно закрыть, чтобы освободить память
        //System.out.println(scanner.nextLine()); сканер уже не задействовать, он закрыт
        ////////////Обработка чисел в массиве, файл 1 2 3 4 5
        File fileWithDigits = new File("src/src/TestFileWithDigits");
        Scanner scannerForDigits = new Scanner(fileWithDigits);
        String digits = scannerForDigits.nextLine();
        String[] arraysForDigits = digits.split(" ");
        int[] arrayDigits = new int[5];
        for (int i = 0; i<arraysForDigits.length; i++) {
            arrayDigits[i] = Integer.parseInt(arraysForDigits[i]);
        }
        System.out.println(Arrays.toString(arrayDigits)); //[1, 2, 3, 4, 5]
    }
}
