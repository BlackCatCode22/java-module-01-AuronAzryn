// I need to import the Scanner class from the
// java.util package - this is how I do that.

// References: https://www.w3schools.com/java/java_user_input.asp
// This is what I used to learn user input

import java.util.Scanner;

public class SumOfUserNums {

    public static void main(String[] args) {
        System.out.println("\n\n Welcome to Sum Of User program... \n\n");
        // Get 3 ints from the user and out the sum of ints.

        // Create the variables needed
      int num1 = 7;
      System.out.println("\n The value of num1 is " + num1 + "\n");

      int num2 = 0;
      int num3 = 0;
      int sumOfTheInts = 0;

      // Get user input
      // Create scanner object named scanner
      Scanner scanner = new Scanner(System.in);
      // Get the first int.
      System.out.println("\n Enter an integer for num1: ");
      num1 = scanner.nextInt();

      // Test it
        System.out.println("\n num1 is: " + num1);
        System.out.println("\n Enter an integer for num2: ");
        num2 = scanner.nextInt();
        System.out.println("\n Enter an integer for num3: ");
        num3 = scanner.nextInt();

        // Test it

        System.out.println("\n num1 is: " + num1);
        System.out.println("\n num2 is: " + num2);
        System.out.println("\n num3 is: " + num3);

        // add them up
        sumOfTheInts = num1 + num2 + num3;

        // Test it
        System.out.println("\n The sum of the ints is: " + sumOfTheInts);

        System.out.println("\n This is the end of my program.");


    }
}