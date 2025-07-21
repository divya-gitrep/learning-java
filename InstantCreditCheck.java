package chapter5;

/*
 *VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more that $25,000 and has credic score of
 * 700 or better. Reject all others
 */

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary= 25000;
    static int requiredCreditScore=700;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){

        //Get what we don't know
        double salary = getSalary();
        int creditScore=getCreditScore();
        scanner.close();
        //Check if the user is qualified
        Boolean qualified= isUserQualified(creditScore,salary);
        //Notify the user
        notifyUser(qualified);

    }

    public static void getFormData(){

    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        int salary= scanner.nextInt();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static Boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
        return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats");
        }
        else{
            System.out.println("Sorry");
        }
    }
}
