/**********
*basicCalculator.java
*Andrew Barnes
*
*Calculator program able to do basic math.
*Simple code with virtually no error handling.
**********/

import java.util.Scanner;

public class basicCalculator
{
 public static void main(String args[])
 {
  Scanner stdIn = new Scanner(System.in);
  double firstNumber;
  double secondNumber;
  double answer = 0;
  String operator;
  String repeat;

  System.out.println("Basic Calculator\n");

 do  //sets up a loop to perform multiple functions
 {
  System.out.print("Enter the first number: ");
  firstNumber = stdIn.nextDouble();
  System.out.print("Enter an operator (+, -, *, /): ");
  operator = stdIn.next();
  System.out.print("Enter the second Number: ");
  secondNumber = stdIn.nextDouble();

  switch (operator.charAt(0))
  {
   case '+':
    answer = firstNumber + secondNumber;
    break;
   case '-':
    answer = firstNumber - secondNumber;
    break;
   case '*':
    answer = firstNumber * secondNumber;
    break;
   case '/':
    answer = firstNumber / secondNumber;
    break;
   default:
    System.out.print("Invalid operator.");
  } //end switch

  System.out.println("Answer: " + answer);
  System.out.print("Do you want to do another calculation? (y/n): ");
  repeat = stdIn.next();

 } while (repeat.equalsIgnoreCase("y")); //end do

 System.out.println("Thank you for using my calculator.");

 } //end main
} //end class basicCalculator
