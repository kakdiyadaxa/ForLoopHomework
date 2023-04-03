import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user ti input a number
        System.out.println("Enter number to check it is prime:");
        int n = scanner.nextInt();

        //Check if no is less than or equal to 1,which is not a prime no
        if (n <= 1) {
            System.out.println(n + "Number is not a prime number.");
        }
        //Initialize a boolean variable isprime to true,
        //assuming that the no is prime unless proven othewise
        boolean isPrime = true;

        //Loop through  possible divisors of the number from 2
        //prime number does not divided by any number except by itself
        for (int i = 2; i <=n/2; i++) {
            //Check if the number is divisible by current divisor
            if (n%i == 0){
                //If it is then number is not prime and loop is terminated
                isPrime = false;

            }
        }
        //Finally print out whether the number is prime or not based on the value of isprime
        if (isPrime){
            System.out.println(n + " is a prime number ");
        }else {
            System.out.println(n + " is not a prime number ");

        }

    }
}
