import java.util.Scanner;

public class SumOf_N_NaturalNumber {
    //main method
    public static void main(String[] args) {
        //create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        //calculate the sum of the first and natural numbers
        //executes until the condition returns ture
        //formula to calculate n*(n+1)/2
        //1+2+3+4+5.....=n as sum of natural number
        for (int i = 1; i <= n; i++) {
            //adding the value of i into sum variable
            sum = sum + i;
        }
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);//prints the sum
        }

    }
