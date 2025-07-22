package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String args[]){


        System.out.println("Enter the number of day:");
        Scanner scanner = new Scanner(System.in);
        int numberOfDay= scanner.nextInt();
        scanner.close();
        System.out.println(getTheDayOfTheWeek(numberOfDay));
    }

    public static String getTheDayOfTheWeek(int i){
        String[] daysOftheWeek = new String[7];
        daysOftheWeek[0]="Monday";
        daysOftheWeek[1]="Tuesday";
        daysOftheWeek[2]="Wednesday";
        daysOftheWeek[3]="Thursday";
        daysOftheWeek[4]="Friday";
        daysOftheWeek[5]="Saturday";
        daysOftheWeek[6]="Sunday";
        return daysOftheWeek[i];

    }
}
