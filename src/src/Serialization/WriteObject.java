package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(123, "Serega");
        Person person2 = new Person(456, "Miha");
        try {
            FileOutputStream fos = new FileOutputStream("src/src/Serialization/people.bin"); //создаст файл.
            // Если указать путь вне проекта, к которому нет доступа, то будет исключение
            //FileOutputStream - класс, предназначенный для записи байтов в файл (любых)
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //ObjectOutputStream - Класс для записи объектов, преобразует объекты в последовательность байтов

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
