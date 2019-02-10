/*Author:Vedran Pehlivanovic
 * COP 3503 Project 2
 *Date:09-11-14
 *
 *Description: This program takes a single input from the user specifically a single positive odd  integer.The output will be the sum of a series 
 *and the sum of a pi series
 *
 */
 
import java.util.Scanner;

public class n00888869 
{

	public static void main(String[] args) {
	
   //Prompt the user for a input
	System.out.print("Please enter a positive odd value number: ");
   
	Scanner input = new Scanner(System.in);
   
   //Local variables.
	double answer= input.nextDouble();
   
	double sum=0;
   
	double piSum=1.0;
   
   double piSumTotal;
	
   //loop for the sum series
	for (int i =1;i<answer; i+=2)
	{
		sum += 1.0 * i / (i + 2);
	}
	//loop for the PI series
	for(int i= 2;i<answer;i+=2)
	{
		
		piSum= (piSum - 1 / (2 * (double)i - 1) + 1 / (2 * (double)i + 1));
	}
   
   piSumTotal = piSum * 4;
	
	//Output
	System.out.printf("The sum of the series is %.8f and the sum of the pi series is %.8f",sum,piSumTotal);
	
	}

	}