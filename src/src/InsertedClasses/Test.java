package InsertedClasses;

public class Test {
    public static void main(String[] args) {
        Electrocar testla = new Electrocar(2255);
        //работа с не статическим вложенным классом:
        testla.start(); //вложенный класс используется где-то внутри

        //работа с статическим вложенным классом
        Electrocar.Battery toshibaN1 = new Electrocar.Battery(); //вложенный класс используется как отдельная сущность
        toshibaN1.charge(); //синтаксис создания распространен в Java
    }
}
