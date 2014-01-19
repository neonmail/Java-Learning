/**********
*tileCost.java
*Andrew Barnes
*
*Program calculates the cost to tile
*a floor (witdth x height) using the
*price of tile entered by the user.
**********/

import java.util.Scanner;

public class tileCost
{
 public static void main(String args[])
 {
  Scanner stdIn = new Scanner(System.in);
  String response;
  double totalArea =0;
  //Do Loop allows user to enter the area for multiple rooms.
  do
  {
   System.out.print("Enter the floor length: ");
   double floorLength = stdIn.nextDouble();
   System.out.print("Enter the floor width: ");
   double floorWidth = stdIn.nextDouble();
   double floorArea = floorLength * floorWidth;
   totalArea += floorArea;
   System.out.print("Do you want to add another room? (y/n): ");
   response = stdIn.next();
  } while (response.equalsIgnoreCase("y")); //end while
  System.out.print("Please enter the price of tile: ");
  double tilePrice = stdIn.nextDouble();
  double totalPrice = tilePrice * totalArea;
  System.out.println("The total price to thile this house is $" + totalPrice);
 } //end main
} //end class tileCost
