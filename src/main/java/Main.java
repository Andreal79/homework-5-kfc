public class Main {
    public static void main(String[] args) {

        Burger burger = new Burger();
        burger.name = "Твистер оригинальный";
        burger.description = ("Твистер Закручен со вкусом! " +
                "Кусочки нежнейшего куриного филе в хрустящей острой или оригинальной панировке" +
                " с сочными листьями салата, " +
                "кусочками помидора и нежным соусом" +
                " мы завернули в пшеничную лепешку и поджарили в тостере. Тут все и закрутилось!");
        burger.price = 159;
        burger.weight = 206;
        burger.calorific = 222;
        burger.proteins = 10.3f;
        burger.fats = 9.2f;
        burger.carbohydrates = 24.5f;

        System.out.println("Название: " + burger.name);
        System.out.println("Описание: " + burger.description);
        System.out.println("Цена: " + burger.price + " руб.");
        System.out.println("Вес: " + burger.weight + " гр.");
        System.out.println("Калорийность: " + burger.calorific + " Ккал.");
        System.out.println("Белки: " + burger.proteins + " гр.");
        System.out.println("Жиры: " + burger.fats + " гр.");
        System.out.println("Углеводы: " + burger.carbohydrates + " гр.");


    }
}
