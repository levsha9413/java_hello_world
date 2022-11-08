import java.sql.SQLOutput;

public class Immutable {
    public static void main(String[] args) {
        String x = "hello";  //строки относятся к Immutable классам, мы не можем изменить их после создания
        x.replace('l','x'); //поэтому замена не произойдет, все методы возвращают новый объект,
        // а не изменяют старый
        System.out.println(x);//hello
        x = x.replace('l','x'); // результат метода нужно где-то сохранить, например перезаписав переменную
        System.out.println(x); //hexxo

        //Конкотенация
        String a = "Hello ";
        String b = "my ";
        String c = "frends";
        String result = a + b + c; //между каждым + создаются новые объекты String, что выжирает память
        System.out.println(result);

        //для операций со строками есть класс StringBuilder, он muttable, при конкотенации
        StringBuilder rez = new StringBuilder("Hello");  //он не расходует лишнюю память
        System.out.println(rez.toString());
        rez.append(" my");
        rez.append(" frends");
        System.out.println(rez.toString());
        rez.append(" and").append(" you").append(" and you"); //можно и так
        System.out.println(rez.toString());

    }

}
