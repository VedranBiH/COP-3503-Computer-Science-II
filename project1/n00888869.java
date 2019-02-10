import java.util.Scanner;
/*
*Name:Vedran Pehlivanovic
*N#:N00888869
*Date:09-05-2014
*
*Project: COP3503 Project1
*Project name: Gas Mileage price
*
*Description: This programs asks the user their driving distance, how many miles per gallon, and the price per gallon
*to calculate their cost of driving.
*
*/
public class n00888869
{
 public static void main(String[] args)
 {
 //local variable
   double cost;
   
 //Creates a scanner
   Scanner input = new Scanner(System.in);
   
 //User input for driving distance
   System.out.print("Enter the driving distance: ");
   double distance = input.nextDouble();
   
   //User input for miles per gallon
   System.out.print("Enter miles per gallon: ");
    double mpg = input.nextDouble();
    
    //User input for price per gallon
   System.out.print("Enter price per gallon: ");
    double price = input.nextDouble();
   
//Cost of trip calculation
   cost = (distance/mpg)*price;
   
  
   //Output the cost of the drive
   System.out.print("The cost of driving is $" + (int)(cost*100)/100.0);
 }
}