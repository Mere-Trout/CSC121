import java.util.Scanner;

public class Magic_Dates
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		
		int month;
		int day;
		int year;
		
		
		System.out.println("This is a program that determines whether your date is magic(month x day =year)\n");
		
		System.out.print("Please enter a month: ");
		month = keyboard.nextInt();
		
		System.out.print("\nPlease enter a day: ");
		day = keyboard.nextInt();
		
		System.out.print("\nPlease enter a year: ");
		year = keyboard.nextInt();
		
		int magic = day*month;

		
		if(magic==year)
		{
			System.out.println("Your date is magical! ");
		}
		else
		{
			System.out.println("Your date is not magical ");
		}
		
		
		
		
		
	}
		
	
}
