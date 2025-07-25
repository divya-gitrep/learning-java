package chapter7;

/*
 *Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average scores, as well as the highest and lowest scores
 */

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("How many grades would you like to enter:");
        grades =new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest" + getHighest());
        System.out.println("Lowest" + getLowestt());
    }

    public static void getGrades(){
        for(int i =0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades[i]=scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade> highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowestt(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
