package Test;

public class PrivrdenieTipov {
    public static void main(String[] args) {
        byte x = 123;
        long y = 1234;
        float z = 12.4f;
        double w = 12.45;

       // float g = 12.3; //ошибка, т.к. 12.3 по умолчанию double
        //long g = 14477; //ошибка, т.к. целочисленные числа по умолчанию int

        float g = 12.3f; //привели тип
        long gL = 123233L; //привели тип

        int i = 123;
        long b = i; //расширяющее приведение типов, из маленького int положили в большой long
                    //неявное приведение

        long gg = 1234567891;
        //int ggj = gg; так нельзя, потому что long большой, int маленький
        int ggj = (int)gg; //явное приведение типов, необходимо при приведении из большого к маленькому типу
        System.out.println(ggj);
        String f = "55";
        //int myInt = (int)f; - не конвертируются
    }
}
