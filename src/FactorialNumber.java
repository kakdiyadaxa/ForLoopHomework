import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        //import the scanner class to read user input
        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        //use method of scanner class
        int number = scanner.nextInt();

        //initialize a variable 'factorialnumber'to 1
        int factorialnumber = 1;
        //we use 'for' loop to iterate from 1 to number and multiply the current value of facnumber
        // with loop variable 'i' in each eteration this continuosly counting the facnumber
        //factorial no like 6x5x4x3x2x1.
        for (int i = 1; i <= number ; i++) {
            factorialnumber *=  i;
        }
        //print method
        System.out.println("Factorial of " + number + " is " + factorialnumber);


    }
}
