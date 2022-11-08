package InsertedClasses;

import java.util.ResourceBundle;

//вложенные классы
public class Electrocar {
    private int id;
    //не статический вложенный класс
    private class Motor{ //вложенный класс для обособления составной сущности
        //имеет доступ к полям основного класса
        //может использоваться в методах основного класса
        public void startMotor(){
            System.out.println("Motor " + id + " is started");
        }
    }
    //статический вложенный класс:
    public static class Battery{ //используется для сущностей с логической связью с основным классом
        public void charge(){// но с меньшей связью чем не статические вложенные классы т.к.
            System.out.println("Battery is charging"); //не имеет доступа к полям основного класса
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Electrocaar " + id + " started");
        Motor motor = new Motor();
        motor.startMotor();

        //вложенный класс в методе
        final int TRY_RESTART = 3; //чтобы вложенный класс имел доступ к переменной, она обязательно должна быть константой
        class Restart{
            public void Restarting(){
                for(int i=1; i<=TRY_RESTART; i++){
                    System.out.println("Try starting " + i + " Electrocar " + id); //имеет доступ и к полю основного
                    // класса и к переменным метода, в который вложен
                }
            }

        }
        Restart restart = new Restart();
        test(restart); //используем объект вложенного в метод класса
    }
    public void test(Object obgect){

    }
}
