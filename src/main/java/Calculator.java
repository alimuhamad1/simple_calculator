import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;


public class Calculator {



    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Use calculator?");
        String answer = sc.nextLine();
        if (calculator.use(answer)) {

            System.out.println("Enter the numbers");

            // take the inputs
            num1 = sc.nextDouble();

            num2 = sc.nextDouble();

            System.out.println("Enter the operator (+,-,*,/)");

            char op = sc.next().charAt(0);

            double o = 0;

            switch (op) {


                case '+':

                    calculator.addition(num1, num2);

                    break;


                case '-':

                    calculator.subtraction(num1, num2);

                    break;


                case '*':

                    calculator.multiplication(num1, num2);

                    break;


                case '/':

                    calculator.divided(num1, num2);

                    break;

                default:

                    System.out.println("You enter wrong input");

                    break;
            }

            System.out.println("The final result:");

            System.out.println();


            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);
        } else {
            System.out.println("Calculator stopped");
        }
        }



    public boolean use (String a) {if (a.equalsIgnoreCase("yes")) {
        return true;
    } else {
        return false;
    }
    }
    public double subtraction (double a, double b) {
        return a - b;
    }

    public double multiplication (double a, double b) {
        return a * b;
    }

    public double divided (double a, double b) {
        return a / b;
    }

    public double addition (double a, double b) {
        return a + b;
    }

}