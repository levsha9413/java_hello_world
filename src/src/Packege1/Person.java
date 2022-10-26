package Packege1;

public class Person {
    public String name;
    int age;
    private String info;
    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Pupa");
        person1.info = "Bybol"; // есть доступ, потому что мы находимся внутри класса Person

        TestPrivate test1 = new TestPrivate();
      //  test1.acssesDenide = "Bup"; //нет доступа, потому что мы находимся снаружи класса TestPrivate
    }
}


class TestPrivate{
    private String acssesDenide;
}