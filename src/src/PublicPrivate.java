import Packege1.Person;

public class PublicPrivate { //исходный класс обязательно публичный, остальные нет
    public static void main(String[] args) {
        //модификаторы доступа
        //privet - доступ только в пределах класса, нельзя обратиться снаружи класса
        //default - модификатор доступа по умолчанию, если мы ничего не проставили
        //все что default - доступно в пределах пакета(директории)
        //protected - доступны в рамках пакета, в потомкам - и вне пакета
        //public - доступ везде в пределах проекта




        Person person1 = new Person("Jonni");
        System.out.println(person1.name);
       // person1.age; //не публичный, не доступен из вне Packege1
    }
}
class MyTest{  //клас не может быть приватным или protected
    protected int mySomeId;
}
