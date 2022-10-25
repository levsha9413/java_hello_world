public class ClassesAndObjects {  //публичный класс является главным, он должен быть и он должен соответствовать файлу .java
    public static void main(String[] args) { //main - это точка входа программы, поэтому пишем тут
    Person Roma = new Person();
    Roma.age = 12;
  //  Roma.name = "Roman";
    Roma.setName("Roma");

    Person Vova = new Person();
    Vova.age = 13;
    //Vova.name = "Vladimir";
    Vova.setName("Vladimir");
    Vova.speak();//методы пишутся с скобками для параметров
    Roma.sayHello();
    System.out.println(Roma.calculateYearsToAdult()); //Теперь метод возвращает данные

    }
}

class AnyClass{ //могут быть и другие классы, кроме public
}

class Person{ //отдельно создаем классы, но используем их в main
    //У класса есть данные, свойства - это поля
    //У класса есть действия, которые он умеет совершать - это методы
    //Поля:
    String name; //поле
    int age; //поле

    void speak(){  //void - тип возвращаемого значения, void пустота, Speak - название метода, () - место для аргумента.
        System.out.println("My name is "+ name + " I'm " + age); //внутри класса поля используются без точки
        //использовать метод нужно в main у конкретного экземпляра
    }

    void sayHello(){ //методы, поля и переменные с маленькой буквы, классы - с большой
        System.out.println("Hello");
        //метод может использовать поля класса, может не использовать
    }

    //Создадим метод, который возвращает данные
    //void ничего не возвращает, из этого метода ничего нельзя получить, string a = Roma.sayHello() - не заработает
    int calculateYearsToAdult(){
        int adultAge = 18;
        return adultAge - age; // возвращает и выходит из метода
        //return "fff" - не заработает, т.к. мы возвращаем int, что указано в объявлении метода
    }

    //метод с параметром:
    void setName(String username){ //можно указывать сразу несколько параметров, разных типов
        name = username;
    }
}