import java.util.Scanner;

public class N_NaturalNumbers_Sum {
     //1+2+3+4+5+6.....+n as sum of Natural number
     //Formula of natural number is n*(n+1)/2
     public static void main(String[] args) {
         //create Scanner object to read user input
         Scanner scanner = new Scanner(System.in);
         //declare variables for limit number,loop counter,and sum
         int num = 0;
         int i = 0;
         int sum = 0;
         System.out.println("Enter the number: ");
         num = scanner.nextInt();//read user input for limit number

         System.out.println("The first " + num + " natural numbers are: ");

         //use a for loop to display the first n natural numbers and calculate their sum
         for (i = 1; i <= num; i++) {
             System.out.println(i + " ");//print each number as we loop through them
             sum = sum + i;//adding the value of i into sum variable so add each number to the running total sum
         }

         System.out.println("The Sum of Natural Numbers = " + sum);

     }

     }

    

