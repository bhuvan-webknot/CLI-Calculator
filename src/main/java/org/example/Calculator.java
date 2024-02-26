package org.example;
import java.util.*;

public class Calculator {
    public static boolean isValidExpression(String expression) {
        // Regular expression to match valid characters (numbers and operators)
        String validCharsRegex = "^[0-9+\\-*/().\\s]+$";
        return expression.matches(validCharsRegex);
    }

    public static void main(String[] args) {
        System.out.println("*********** CLI CALCULATOR APPLICATION ***********");
        System.out.println("Features => \n1.Follows BODMAS\n2.Handles Exception and invalid expressions\n");
        //For displaying the user-menu
        while(true){
            System.out.println("You can perform the following operations :)");
            System.out.println("1. Addition -> +\n2.Subtraction -> -\n3.Multiplication -> *\n4.Division -> /\n5.Enter q for exit.\n\nEnter the expression to be evaluated : ");

            //For inputting the expression by user
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            input = input.replaceAll("\\s", "");
            System.out.println(input);
            try {
                if (isValidExpression(input)) {
                    //Actual Logic
                    //1. Convert the input to Postfix notation.
                    //2. Evaluate the postfix notaion.
                } else {
                    System.out.println("Error: Invalid characters in the expression,\nPlease enter valid expression");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("\nType r to restart and q to quit");
            char ch = sc.next().charAt(0);
            System.out.println("***********************************************\n");
            if(ch=='q')
                break;
            else if(ch=='r')
                continue;
        }
    }
}
