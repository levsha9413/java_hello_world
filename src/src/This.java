public class This {
    public static void main(String[] args) {
        Human Zhora = new Human();
        Zhora.setName("Zhora");
        Zhora.setAge(22);
        System.out.println("Hello, I,m "+Zhora.getName() + " I,m "+ Zhora.getAge() );

    }
}
//this позволяет изнутри класса, обратиться к объекту класса this.setAge -> Zhora.setAge
class Human{
    private int age;
    private String name;

    public void setAge(int age){ //в сетерах принято использовать this чтобы указать на поле, по аналогии с self в питоне
        this.age = age;  //теперь  не нужно придумывать разные переменные
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}