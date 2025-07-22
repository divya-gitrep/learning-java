package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    //Initialize what we know
    static Scanner scanner = new Scanner(System.in);
    static double subtotal;
    static double overageFees;

    public static void main(String args[]){

        //Get what we don't know
        double planFee=getPlanFee();
        int overageMinutes=getOverageMinutes();
        overageFees = overageFees(overageMinutes);
        System.out.println(overageFees);
        subtotal = planFee + overageFees;
        System.out.println(subtotal);
        double tax = calculateTax(overageFees);
        System.out.println(tax);
        double finalTotal = finalTotal(planFee,overageFees,tax);
        System.out.println(finalTotal);


        //Make decision or Calculate Result


    }

    public static double getPlanFee(){
        System.out.println("Enter the plan fee:");
        double planFee= scanner.nextDouble();
        return planFee;

    }

    public static int getOverageMinutes(){
        System.out.println("Enter the number of overage minutes:");
        int overageMinutes= scanner.nextInt();
        return overageMinutes;

    }

    public static double calculateTax(double subtotal){
        double tax = 0.15 * subtotal;
        return tax;

    }

    public static double overageFees(int overageMinutes){
        double overageFees=0.25 * overageMinutes;
        return overageFees;

    }

    public static double finalTotal(double planFees, double overageFees, double tax){
        double finalTotal = planFees + overageFees + tax;
        return  finalTotal;
    }


}
