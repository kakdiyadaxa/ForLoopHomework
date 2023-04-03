import java.util.Scanner;

public class CalculateSumOf_N_Positive {
    public static void main(String[] args) {
        //get scanner input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer n: ");

        //declare a variable to store the current number in the series
        int n = scanner.nextInt();
        //decare and initialize a variable to store the sum
        double sum = 0.0;

        //loop from 1 to n and add 1/i to the sum for each i
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0/i;//add the current number in the series to the sum
        }
        //print the sum of the series
        System.out.println("Sum of series 1 + 1/2 + 1/3 + ... + 1/n = " + sum);
    }

}
