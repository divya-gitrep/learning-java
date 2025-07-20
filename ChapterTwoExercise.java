package chapter2;

import java.util.Scanner;

public class ChapterTwoExercise {

    public static void main(String arg[]){
        //1.Get the season of the year
        System.out.println("Enter the season:");
        Scanner scanner=new Scanner(System.in);
        String season=scanner.next();

        //2.Get the whole number
        System.out.println("Enter the whole number:");
        int wholeNumber=scanner.nextInt();


        //3.Get the adjective
        System.out.println("Enter the adjective:");
        String adjective=scanner.next();
        scanner.close();

        //4. Print the out put as "On a [adjective][season of the year] day, I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum  of "+wholeNumber+" cups of coffee.");

    }
}
