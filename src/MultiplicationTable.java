import java.util.Scanner;
  public class MultiplicationTable {
        public static void main(String[] args) {

            //create an object of Scanner class
            Scanner scanner = new Scanner(System.in);

            //print for user input
            System.out.println("Enter a number with you want to do Multiplication:");
            int number = scanner.nextInt();//create object for the number of with you want to do multiply

            System.out.println("Multiplication table of " + number + ":");

            //formula for the multiplication table from 1 to 12
            for (int i = 1; i <= 12; i++) {

                System.out.println(number + "x" + i + "=" + (number*i));//print for muliplication

            }

        }



    }




