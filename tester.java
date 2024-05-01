import java.util.Scanner;


public class tester 
{

	public static void main(String args[])
	{
		points(userInput());
	}
	
	
	
	
	public static int userInput()
	{
		Scanner keyboard = new Scanner(System.in);
		int input;
		do 
		{
		System.out.print("Please enter the amount of comics you purchased: ");
		input = keyboard.nextInt();
		
		if (input<0)
		{
			System.out.println("\nError: Comics cannot be less than zero\n");
		}
		}
		while(input<0);
		
		return input;
		
		
	}
	
	public static void points(int amount)
	{
		if (amount>=0 && amount<=10)
		{
			System.out.println("\nCongratulations, you were awarded 20 points!");
		}
	}
}
