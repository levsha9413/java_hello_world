package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptons3 {
    public static void main(String[] args) {
        try {
            ReadFile();  //т.к. метод может выбросить исключение, его тоже нужно предохранять
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void ReadFile() throws FileNotFoundException { //исключение выбросится на уровень выше
        File file = new File("path/does/not/exist");
        Scanner scanner = new Scanner(file);
    }
}

