package Exeptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptiom4 {
    public static void main(String[] args){
        try {
            run();
        } catch (IOException | ParseException e) {  //конструкция "или" - multicatch
            e.printStackTrace();
        }

        try{
            run();
        }catch (Exception e){
            System.out.println("Этот cath перехватит вообще все исключения");
        }catch (RuntimeException t){
            System.out.println("этот блок уже бессмысленен");
        }

    }
    public static void run() throws ParseException, IOException { //метод может выбрасывать
        // несколько исключений

    }
}


