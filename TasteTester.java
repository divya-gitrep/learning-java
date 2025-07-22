package chapter9;

public class TasteTester {
    public static void main(String args[]){

        BirthdayCake birthdayCake = new BirthdayCake("coffee cream",20,"blue");
        System.out.println(birthdayCake.getFlavor());
        System.out.println(birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake("vanilla", 30, 3);
        System.out.println(weddingCake.getFlavor());
        System.out.println(weddingCake.getPrice());



    }




}
