package chapter11;

public class Farm {
    public static void main(String args[]){
        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();
    }
}
