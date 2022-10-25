//final используется для обозначения констант

public class Final {
    public static void main(String[] args) {
        final int X = 13; //всегда большими буквами
    }
}

class Test{
    public final int RANDOM_CONSTANTA;

    Test(int x){
    RANDOM_CONSTANTA = x;
    }

    /*
    public void setRANDOM_CONSTANTA(int a){
        RANDOM_CONSTANTA = a;    - так делать нельзя, т.к. константу нельзя изменять
    }
    */
}

class Test2{
    public static final int RANDOM_CONST = 10; //при использовании констант в классах, нужно использовать их как
                                                //статический атрибут, т.к. она все равно будет одинакова
                                            //внутри каждого объекта
                                            //так мы будем экономить память
}
