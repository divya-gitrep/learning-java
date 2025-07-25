package chapter4;

/*
 *LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){

        //Get Text
        System.out.println("Enter the text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound=false;

        //Search text for letter 'A'
        for(int i=0; i<text.length();i++){
            char currentLetter=text.charAt(i);
            if(currentLetter=='A' || currentLetter=='a'){
                letterFound=true;
                break;
            }
        }

        if(letterFound){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
