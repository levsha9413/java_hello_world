package Enum;
//Object->Enum->Season->
public enum Season {
    SUMMER("Лето"), FALL("Осень"), WINTER("Зима"), SPRING("Весна"); //объекты класса Season
    //т.к. мы переопределили конструктор, нужно дописать аргументы
    private String translition;
    private Season(String translation){ //приватный, потому что в ручную объекты не будут создаваться
        this.translition = translation;
    }

    public String getTranslition() {
        return translition;
    }

    public String toString(){
        return getTranslition();
    }
}
