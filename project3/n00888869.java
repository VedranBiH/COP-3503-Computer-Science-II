import java.util.Scanner;
/*COP3503
*Project 3
*Author:Vedran Pehlivanovic
*Date:09/30/2014
*N#:N00888869
*
*Description: This program creates two arrays by using user input and then does various methods
*like seeing if they are even, how many elements are even, the average of both arrays,displaying only odd
*cell values, and figuring out if the cell values in both arrays lie between 1 and up to 10.
*/
public class n00888869
{
public static void main(String[] args)
   {
      //declare two arrays
       int[][] list1 = new int[3][3];
       int[][] list2 = new int[3][3];
       
      java.util.Scanner input = new java.util.Scanner(System.in);
      
      //initalize the two arrays with the user input
      System.out.print("Enter for list1 " + list1.length + " rows and " + list1[0].length + " colums:");
      for(int i = 0; i < list1.length; i++)
         for(int j = 0; j < list1[i].length; j++)
         list1[i][j] = input.nextInt();
         
       System.out.print("Enter for list2 " + list2.length + " rows and " + list2[0].length + " colums:");
      for(int i = 0; i < list2.length; i++)
         for(int j = 0; j < list2[i].length; j++)
         list2[i][j] = input.nextInt();
         
         //check if m1 equals m2
         if (Strict.equals(list1, list2))
    	System.out.println("The two arrays are strictly identical\n");
    else
    	System.out.println("The two arrays are not strictly identical\n");  
      
      //call the method howMany in the class strict
      System.out.println(Strict.howMany(list1,list2) + "\n");
      
      //call the method diagonal in the class Strict
      System.out.println(Strict.diagonal(list1,list2) + "\n");
      
      //Call the method average and place it in the variable averageRounded
      double averageRounded = Strict.average(list1,list2);
      //format the average value to two decimal places
      System.out.printf("%.2f\n\n",averageRounded);
      
      //call the method display  
      Strict.display(list1,list2);
     
      System.out.println();
     //call the method silly
      System.out.print(Strict.silly(list1,list2));
   }
}

class Strict
{
      //A method that checks if the two arrays are equal and returns true or false
      public static boolean equals(int[][] m1, int[][] m2)
      {
         for (int i = 0; i < m1.length; i++)
  		for (int j = 0; j < m1[0].length; j++)
  			if (m1[i][j] != m2[i][j])
  				return false;
  		
    return true;

      }
      
      //a method that checks how many cell values are equal in both arrays
      public static int howMany(int[][] m1, int[][] m2)
      {
         int count = 0;
         for (int i = 0; i < m1.length; i++)
  		   {   
           for (int j = 0; j < m1[0].length; j++)
  			      if (m1[i][j] == m2[i][j])
               count++;
         }    
               return count;
      }
         //a method that checks the values in [0][0],[1][1],and [2][2] and returns the number of equal values
         public static int diagonal(int[][] m1,int[][] m2)
         {
         int count = 0;
         for (int i = 0; i < 3; i++)
  		   if (m1[i][i] == m2[i][i])
               count++;
               
               return count;
         
         }
            //a method that computes the average of both arrays and returns the value
            public static double average(int[][] m1,int[][] m2)
            {
            double sum1 = 0;
            double sum2 = 0;
            
            for (int i = 0; i < m1.length; i++)
  		      for (int j = 0; j < m1[0].length; j++)
            {
               sum1 += m1[i][j];
               
            }
            for (int i = 0; i < m2.length; i++)
  		      for (int j = 0; j < m2[0].length; j++)
            {
            sum2 += m2[i][j];
            }
            double average = (sum1 + sum2)/18;
            return average;
            
            }
               //a method that displays values that are only odd in both arrays
              public static void display(int[][] m1,int[][] m2)
               {
           
                for(int i = 0; i < m1.length; i++)
                  {
                 for(int j = 0; j < m1[i].length; j++)
                     { 
                       if(m1[i][j]%2 != 0)
                       System.out.print(m1[i][j] + "\t");
                     }
                    System.out.println(); 
                  }
                  
                  System.out.println();
                  
                  for(int i = 0; i < m2.length; i++)
                  {
                 for(int j = 0; j < m2[i].length; j++)
                     { 
                       if(m2[i][j]%2 != 0)
                       System.out.print(m2[i][j] + "\t");
                     }
                    System.out.println(); 
                  }  
               }
               
                  //a method that returns true or false if the values in both arrays are between 1 and up to 10
                  public static boolean silly(int[][] m1,int[][] m2)
                  {
                  boolean z = true;
                  boolean x = true;
                    for(int i = 0; i < m1.length; i++){
                     for(int j = 0; j < m1[i].length; j++)
                      if((m1[i][j] > 10) || (m1[i][j]<=1))
                         z = false;
                         }
                      
                    for(int i = 0; i < m2.length; i++)
                    for(int j = 0; j < m2[i].length; j++)
                      if((m2[i][j] > 10) || (m2[i][j] <= 1))
                      x = false;
                        if((z == true) && (x == true)){
                        z = true;
                        }
                          else{
                           z = false;
                           }
               return z;
                  }
}