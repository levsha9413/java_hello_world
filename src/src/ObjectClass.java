//любой класс в java наследуется от класса Object
//т.е. получает его методы и поля

public class ObjectClass {
    public static void main(String[] args) {
        String myString = "hello";
        System.out.println(myString);
        Wuman Dasha = new Wuman(24, "Dari9");
        System.out.println(Dasha); //выводится хэш код объекта Wuman@28a418fc,
                                    //используется метод toString унаследованный от класса Object
                                    //но при желании его можно переопределить
                                     //для этого нужно переопределить метод внутри класса потомка, по сигнатуре

    }
}

class Wuman{
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;
    }
    Wuman(int age, String name){
        this.setAge(age);
        this.name = name;
    }

    public String toString(){     //переопределили метод родителя
        return (this.name + " " + this.age); // теперь принт будет выводить то, что нам нужно
    }
}