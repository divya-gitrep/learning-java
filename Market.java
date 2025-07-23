package chapter10;

public class Market {

    public static void  main(String args[]) {

        Apple apple = new Apple();
        apple.makeJuice();
        apple.removeSeeds();
        fruitPie(apple);

        Banana banana = new Banana();
        banana.makeJuice();
        banana.removePeel();
        fruitPie(banana);

        Fruit app = new Apple();
        app.makeJuice();
        fruitPie(app);

        app = new Banana();
        app.makeJuice();
        ((Banana) app).removePeel();


        Fruit ban = new Banana();
        ban.makeJuice();
        fruitPie(ban);

    }

    public static void fruitPie(Fruit fruit){
        if(fruit instanceof Apple){
            System.out.println("This is Apple Pie");
        }
        else if(fruit instanceof Banana){
            System.out.println("This is Banana Pie");
        }
    }



}
