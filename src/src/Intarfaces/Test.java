package Intarfaces;

public class Test {
    public static void main(String[] args) {
        Person miha = new Person(24, "Miha");
        Animal cat = new Animal(121);
        miha.hello();
        miha.showInfo();
        cat.showInfo();

        Info info1 = new Animal(23); //так можно делать, потому что в Animal точно есть все методы Info
        Info info2 = new Person(22, "Pahan");  //пример полиморфизма
        info1.showInfo();
        info2.showInfo();
        outputInfo(cat);
        outputInfo(miha);


    }
    public static void outputInfo(Info someInfo){ //этот метод также будет принимать Animal и Person, т.к.
        someInfo.showInfo();                      //они реализуют все методы Info
    }
}
