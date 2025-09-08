package lab1;

/**
 * 09/08/25
 * Lab 1 FizzBuzz
 */
public class FizzBuzz {
    public static void main(String[] args){
        int i = 1;

        while (i < 100){
            // FInd out which numbers are divisible by 3 and 5
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            // Print the result
            FizzOrBuzz(fizz, buzz, i);

            i++;
        }
    }

    private static void FizzOrBuzz(boolean fizz, boolean buzz, int i) {
        if (fizz && buzz){
            System.out.println("FizzBuzz!");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
