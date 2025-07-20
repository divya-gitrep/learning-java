package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String atgs[]){
        int total = 0;
        for(int i=0;i<5;i++){
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            total = total + die;
        }
        if(total>20)
            System.out.println("You exceeded the score of 20");
        else if(total<20)
            System.out.println("You are short of few points in scoring 20");
        else
            System.out.println("You won");
        System.out.println(total);

    }
}
