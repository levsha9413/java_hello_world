package Generics;  //Параметризация
import java.util.ArrayList; //динамический массив
import java.util.List; //интерфейс

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("cat");//можно расширять бесконечно, не нужно указывать размерность при создании
        animals.add("dog");
        animals.add("frog");
        //String x = animals.get(1); //хотим получить dog, но не можем, т.к. элемнт листа это объект класса Object
        String x = (String) animals.get(1); //делаем downcast чтобы преобразовать Object в String

        //////////////С появлением дженериков это всё упростилось (параметризация листа)
        List<String> animals2 = new ArrayList<String>();
        animals2.add("dog");
        animals2.add("frog");
        animals2.add("cat");
        String y = animals2.get(2); //получаем cat без бубна, т.к. ранее указали что лист хранит объекты класса String
        System.out.println(y);

        /////////java 7 еще упростила
        List<String> animal3 = new ArrayList<>(); //можно не указывть <String>
        //animal3.add(2); сразу не дает нам так сделать
    }
}
