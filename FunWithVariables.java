// FunWithVariables.java
// aD 8/14/2025
//
  // references
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class FunWithVariables {
    public static void main(String[] args) {
        System.out.println("\n\n *** Welcome to my Fun With Variables Program! \n\n");
        // Create a String variable named anything.
        String anything = " something else ";
        System.out.println(anything);


        // Create a coupe of int vars named num1 and num2.
        int num1 = 0;
        int num2 = 0;



        Scanner scanner = new Scanner(System.in);

        // Get a value from the user and store in num1.
        System.out.println("\n Enter a whole number for num1: ");
        num1 = scanner.nextInt();

        // Prove that you got an int from the user
        System.out.println(" num1 = " + num1);

        System.out.println(" Enter a whole number for num2: ");
        num2 = scanner.nextInt();

        System.out.println(" num2 = " + num2);
    }
}