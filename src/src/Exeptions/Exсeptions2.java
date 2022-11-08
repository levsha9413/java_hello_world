package Exeptions;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedMap;

///в данном примере обрабатываем исключение конструкцией try - catch
public class Exсeptions2 {
    public static void main(String[] args) {
        File file = new File("path/does/not/exist");
        try{
            Scanner scanner = new Scanner(file);
            System.out.println("Этот принт не выполнится если вылетит исключение");
        }catch(FileNotFoundException e){ //ловим объект 'е' класса FileNotFoundException
            e.printStackTrace(); //стандартно печатаем трейсбэк
            System.out.println("Файл не найден");// тут также можем реализовать свое поведение
        }
        System.out.println("Остальная программа выполняется, не падает из-за исключения");
    }
}
