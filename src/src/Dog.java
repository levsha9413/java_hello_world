public class Dog extends Animal{  //Расширяет класс энимал
    public void bark(){   //новый метод
        System.out.println("BARK! BARK! BARK!");
    }
    public void eat() {  //переопределили метод родителя
        System.out.println("Dog eating!");;
    }
}
