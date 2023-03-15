package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-using-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find Square Root\nPress 2 to find Log\nPress 3 to find Factorial\nPress 4 to find Power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do Multiplication
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
//                    System.out.print("Enter the second number : ");
//                    number2 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+"  is : " + calculator.squareroot(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find cube root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Logof "+number1+" is : " + calculator.log(number1));
                    System.out.println("\n");

                    break;
                case 3:
                    // find square
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square of "+number1+" is : " + calculator.fac(number1));
                    System.out.println("\n");

                    break;
                case 4:
                    // do Subtraction
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("POWER of "+number1+" from "+number2+" is : " + calculator.pow(number1,number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double squareroot(double number1) {
        logger.info("[SQUAREROOT - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQUAREROOT] - " + result);
        return result;
    }

    public double log(double number1) {
        logger.info("[LOG] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - LOG] - " + result);
        return result;
    }

    public double fac(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result=1;
        for(int i=1;i<=number1;i++)
            result = result * i;
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double pow(double number1, double number2) {
        logger.info("[POWER of" + number1 + " FROM " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }


}

