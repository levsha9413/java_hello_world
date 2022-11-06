package WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("src/src/WriteToFile/TestFile"); //принимает также строки, обрабатывает их не как путь
        PrintWriter printWriter = null; //нужна инициализация до {} иначе будет вне зоны видимости
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        printWriter.println("String4");
        System.out.println(System.in);
        printWriter.println("String5");
        printWriter.close(); //обязательно, закрываем, также как и сканер
        //повторный запуск программы перепишет строчки

    }
}
