public class Constructor {
    public static void main(String[] args) {
    Man pupa = new Man("Pupa");
        System.out.println(pupa.getName());

    }
}
//Конструктор используется для задания параметров объекту, прямо во время создания
//если конструктор не прописан, то используется конструктор по умолчанию - Man()

class Man{
    private int age;
    private String name;

    public Man(){ //конструктор(пустой) - не имеет возвращаемого типа, имя совпадает с именем класса
        System.out.println("Приветули");
    }
    public Man(String name){ //перегрузка методов - оба метода работают, пока у них разные параметры,
        this.name = name;    //по параметру Java понимает какой именно метод нужно вызвать в конструкторе
    }

    public String getName(){
        return name;
    }
}