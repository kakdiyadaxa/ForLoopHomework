import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //creating a variable number to be reserved
        //creating a variable reverse num to store
        int number = 123456;
        int reversenumber = 0;

        // System.out.println("Enter a number:");

        //import scanner class to read user input
        //create scanner object to read user input
        // Scanner scanner = new Scanner(System.in);

        //we use method of scanner for int
        //  number = scanner.nextInt();

        //using for loop as the digits of the original number in reverse order
        //we do this by repeatedly dividing by 10 , until the number becomes zero.
        for (; number!=0; number/=10){
            reversenumber = reversenumber * 10 +number % 10;
        }
        System.out.println(reversenumber);//print the reverse number



        }

    }

