package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){

        //Initialize the values we know
        int quota=10;

        //Get the values we don't know
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //Make a decision  on the path to take-Output
        if(sales >=quota)
            System.out.println("Congratulations!!");

        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " short");
        }
    }
}
