package chapter10;

public class Banana extends Fruit {

    public Banana() {
        setCalories(130);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana Juice is made");
    }
    public void removePeel(){
        System.out.println("Banana is peeled");

    }
}
