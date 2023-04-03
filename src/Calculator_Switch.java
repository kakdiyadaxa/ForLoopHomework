import java.util.Scanner;

public class Calculator_Switch {
    public static void main(String[] args) {

     //we are using data type double so that user can
     //enter integer as well as floating point value
    double num1, num2, result;
    char operator;

    Scanner scanner = new Scanner(System.in);//create Scanner object to user input

        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();//read user input for num1

        System.out.println("Enter second number: ");//read user input for num2
        num2 = scanner.nextDouble();

        System.out.println("Enter an operator(+,-,*,/): ");
        operator = scanner.next().charAt(0);//read user input for operator

        //perform calculation based on operator
        switch (operator){
            case '+': //if operator is addition
                result = num1 + num2;//perform addition operation
                System.out.println(num1 +  " + "  + num2 + "=" +result);
                break;//exit switch statement
            case '-'://if operator is subtraction
                result = num1 - num2;//perform subtraction operation
                System.out.println(num1 +  " - "  + num2 + "=" +result);
                break;//exit switch statement
            case '*'://if operator is multiplication
                result = num1 * num2;//perform multiplication operation
                System.out.println(num1 +  " * "  + num2 + "=" +result);
                break;//exit switch statement
            case '/'://if operator is division
                result = num1 / num2;//perform division operation
                System.out.println(num1 +  " / "  + num2 + "=" +result);
                break;//exit switch statement
            default://if operator is not one of the above
                System.out.println("Invalid operator");//print error message
        }
    }
}
