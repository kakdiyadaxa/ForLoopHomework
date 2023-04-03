import java.util.Scanner;

public class TenNumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create scanner object

        System.out.println("Enter the first number of the range: ");
        int n = scanner.nextInt();//using obj for variable n

        System.out.println("Enter the second number of the range: ");
        int b = scanner.nextInt();//using obj for variable b

        System.out.println("10 numbers between :");

        //Loop through the next 10 numbers after starting number and print each number
        for (int i = n; i <= b; i++) {

            System.out.println(i);//print the value
        }
    }
}
