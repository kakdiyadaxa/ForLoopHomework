import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create scanner obj
        //print method
        System.out.println("Enter the number as you want to print in the Fibonacci Number:");
        // using method
        int n = scanner.nextInt();//get n from user input

        int lastnumber = 1,currentnumber = 1;//initialize the first two numbers of the sequence
                                             //and are always 1.
        System.out.println(lastnumber + " " + currentnumber +" ");//print the first two numbers

        // use for loop to calculate next numbers
        //fibonacci number like 1,1,2,3,5,8,13,21...
        for (int i = 2; i < n; i++) {
            int nextNumber = lastnumber + currentnumber;
            System.out.println(nextNumber + " ");//print next number
            lastnumber = currentnumber;
            currentnumber = nextNumber;//update the last and current numbers

        }



    }


}
