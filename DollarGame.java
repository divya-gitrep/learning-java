package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]){

        //What we know

        //What we don't know
        System.out.println("Enter the numbers of pennies:");
        Scanner scanner= new Scanner(System.in);
        int pennies=scanner.nextInt();

        System.out.println("Enter the numbers of nickels:");
        int nickels=scanner.nextInt();

        System.out.println("Enter the numbers of dimes:");
        int dimes=scanner.nextInt();

        System.out.println("Enter the numbers of quarters:");
        int quarters=scanner.nextInt();

        scanner.close();

        double total=(0.01*pennies)+(0.05*nickels)+(0.1*dimes)+(0.25*quarters);

        //Make decision
        if(total==1)
            System.out.println("Congrats");
        else if(total<1)
            System.out.println("Your are short of" + (1-total));
        else if(total>1)
            System.out.println("You are over by" + (total -1));

    }
}
