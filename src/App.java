import java.util.*;

/**
 * Task: Write code that will take input and output different messages.
 * 
 * Description: Our code should take in inputs then print a message based on
 * divisibility tests.
 * 
 * Basic task (up to B+ level): Take input from the user. Output if the number
 * is even or odd.
 * 
 * Moderate task (up to A level): Do all of the above AND check to see if the
 * number is divisible
 * by 3 and/or 5:
 * If the number is divisible by 3, print "The number is divisible by 3."
 * If the number is divisible by 5, print "The number is divisible by 5."
 * If divisible by both 3 and 5, print "The number is divisible by both 3 and
 * 5."
 * 
 * Challenge task (up to A+ level): Complete both of the above AND check to see
 * if the number
 * is greater than 0 and less than 100. If the number is less than 0 or above
 * 100, say "Wrong number!".
 * If the number is between 0 and 100, check to see if it is a prime number. A
 * prime number less than
 * 100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 * 
 */

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        int remainder2 = number % 2;
        if (remainder2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        int remainder3 = number % 3;
        if (remainder3 == 0) {
            System.out.println("The number is divisible by 3");
        }
        int remainder5 = number % 5;
        if (remainder5 == 0) {
            System.out.println("The number is divisible by 5");
        }
        if (remainder3 == 0 & remainder5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        }
        if (number < 0) {
            System.out.println("Wrong number!");
        }
        if (number > 100) {
            System.out.println("Wrong number!");
        }
        int remainder7 = number % 7;
        int remainder1 = number % 1;
        int remainder9 = number % number;
        if (number > 0 && number < 100) {
            if (remainder9 == 0 && remainder1 == 0 && !(number == 2) && !(number == 3) && !(number == 5)
                    && !(number == 7) && !(remainder7 == 0) && !(remainder2 == 0) && !(remainder5 == 0)
                    && !(remainder3 == 0)) {
                System.out.println("The number is prime");
            }
            if (number == 2) {
                System.out.println("The number is prime");
            }
            if (number == 3) {
                System.out.println("The number is prime");
            }
            if (number == 5) {
                System.out.println("The number is prime");
            }
            if (number == 7) {
                System.out.println("The number is prime");
            }
        }
        if (remainder9 == 0 && remainder1 == 0 && remainder7 == 0) {
            System.out.println("The number is not prime");
        }
        if (remainder2 == 0) {
            System.out.println("The number is not prime");
        }
        if (remainder5 == 0) {
            System.out.println("The number is not prime");
        }
        if (remainder3 == 0) {
            System.out.println("The number is not prime");
        }

    }
}
