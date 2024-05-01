
import java.util.Scanner;



public class testScores 
{
	public static void main(String args[])
	{
		
		Scanner keyboard = new Scanner (System.in);
		
		int score1;
		int score2;
		int score3;
		int average;
		
		System.out.println("This is a program that takes the average of three test score and gives you a grade. ");
		
		System.out.print("\nPlease enter your score for test 1: ");
		score1= keyboard.nextInt();
		
		System.out.print("\nPlease enter your score for test 2: ");
		score2= keyboard.nextInt();
		
		System.out.print("\nPlease enter your score for test 3: ");
		score3= keyboard.nextInt();
		
		average = (score1+score2+score3)/3;
		
		if (average>=90 && average<=100)
		{
			System.out.println("\nYou got an A with an average score of "+average);
			
		}
		else if(average>=80 && average<=89)
		{
			System.out.println("\nYou got a B with an average score of "+average);
		}
		else if (average>=70 && average<=79)
		{
			System.out.println("\nYou got a C with an average score of "+average);
		}
		else if (average>=60 && average<=69)
		{
			System.out.println("\nYou got a D with an average score of "+average);
		}
		else
		{
			System.out.println("\nYou got a F with an average score of "+average);
		}
		
		
		
		keyboard.close();
	
		
		
	}
}
