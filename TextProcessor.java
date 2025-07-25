package chapter8;

public class TextProcessor {

    public static void main(String args[]){
        countWords("I love Test Automation University");
        reverseString("Hello TAU");
        addSpaces("HeyWorldItsMeAngie");

    }

    /**
     * Splits a string into an array by tockenizing it
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords= words.length;
        String message=String.format("Your text  contains %d words", numberOfWords);
        System.out.println(message);

        for (int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }

    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */

    public static void addSpaces(String text){
        var modiefiedText= new StringBuilder(text);
        for(int i =0; i<modiefiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modiefiedText.charAt(i))){
                modiefiedText.insert(i, " ");
                i++;
            }
        }
    System.out.println(modiefiedText);
    }
}
