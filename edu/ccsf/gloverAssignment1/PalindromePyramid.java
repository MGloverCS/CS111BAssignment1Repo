package edu.ccsf.gloverAssignment1; //Assigns Java file to appropriate package

import java.util.Scanner; //Imports scanner in order for code to accempt inputs.

public class PalindromePyramid { //Set public class
 public static void main(String[] args) { //Set main string.
  int i, j, n; //Creates important variables.
  Scanner scan = new Scanner(System.in); // Sets scanner input as an int
  System.out.print("Please enter the height of your pyramid : \t"); //User inputs desired height of pyramid
  n = scan.nextInt();
  while (n > 7) { //If user input is greater than 7, while loop engages, and asks user to input number less than or equal to 7.
	  System.out.print("ERROR: enter a height of at most 7: \t"); //Error message. User is asked for new input.
	  n = scan.nextInt(); // New input
  }
  scan.close(); //Scan is closed
  for (i = 1; i <= n; i++) {
   for (j = i; j < n; j++)
    System.out.print(" ");
   for (j = 1; j <= i; j++)
    System.out.print(j);
   for (j = i - 1; j >= 1; j--)
    System.out.print(j);
   System.out.print("\n");
  }

 }
}