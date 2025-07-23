import java.util.Arrays;

public class chapter14 {

    public static void main(String args[]) {

        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(Arrays.toString(numbers));
        int[] arr = new int[5];

       for (int i = 0; i < numbers.length; i++) {
            arr[numbers.length-(i+1)]=numbers[i];
        }

        numbers = arr;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);







    }



        }




