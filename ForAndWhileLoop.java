//Evan White

import java.util.Scanner;
import java.util.Random;

public class ForAndWhileLoop
{
	public static void main(String[] args)
	{
		//for loop
		//complete the for loop below that lists the first ten integers,
		//   the square of the number    Use the Math method?? Math.pow(___, 2)
		//   and the cube of the number  Use the Math method?? Math.pow(___, 3)
		//   example:      1     1     1
		//                 2     4     8

		for(int num = 1; num <= 10; num++)
		{
			System.out.println(num + "    " + (Math.pow(num, 2) + "    " + (Math.pow(num, 3))));
			
		}

		//===================================
		//===================================

		//while loop
		//generate 10 random numbers between 50 and 100, inclusive
		//inside the loop
		//  if the randNum >= 90, print 'A'
		//  if the randNum >= 80, print 'B'
		//  if the randNum >= 70, print 'C'
		//  if the randNum <  70, print 'F'
		//  accumulate the total of the 10 random numbers
		//after the loop, print the accumulated total

		Random rand = new Random(1234);
		int counter = 0;                         //start
		int accumNumbers = 0;


		while(counter < 10)                      //stop
		{
			int randNum = rand.nextInt(51) + 50;

		   if(randNum >= 90) 
		  {
			  System.out.println('A');
		  }
		   else if(randNum >= 80)
		  {
			  System.out.println('B');
		  }
		   else if(randNum >= 70)
		  {
			  System.out.println('C');
		  }
		   else
		  {
			  System.out.println('F');
	      }
		   counter++;
			  accumNumbers += randNum;
		}
		  System.out.println("Accumulated Numbers: " + accumNumbers);
	}
}