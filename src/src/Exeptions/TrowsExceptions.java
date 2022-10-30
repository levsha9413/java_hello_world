package Exeptions;

import java.io.IOException;
import java.util.Scanner;

public class TrowsExceptions {
    public static void main(String[] args) throws MyCustomException { //указываем что класс может выбросить исключение
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x==0){ //условие для примера
                //throw new IOException(); //выбрасываем исключение
                throw new MyCustomException("My custom error text"); //создали свое кастомное исключение
            }
        }
    }
}
