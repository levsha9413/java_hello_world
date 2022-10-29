package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
///в данном примере указываем исключение в сигнатуре метода
public class Exсeptions1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/src/ghfgh"); //кривой путь для выброса исключения
        Scanner scanner = new Scanner(file);
    }
}
