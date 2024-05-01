import java.util.Scanner;
public class PenniesforPay
{
	public static void main(String args[])
	{
		
		int rate = 2;						 //Variables for program
		int days;
		int save =0;
		double salary = 0.01;
		
		
		
		Scanner keyboard = new Scanner(System.in);		//Initializing the scanner
		
		
		
		
		do 
		{
			System.out.print("Please enter the amount of days you've worked: ");
			days = keyboard.nextInt();
			if (days<1)																//Takes user input of days and validates it
			{
				System.out.println("\nError: Cannot work less than a day!\n");
			}
		}
		while(days<1);
		
		save=days;
		
		
		
		System.out.println("\nDay\t\tPay");
		System.out.println("----------------------");
		for(days = 1; days<=save; days++)
		{
			
			System.out.println(days+"\t\t"+salary);
			salary*=rate;
			
		}
		
		
		
		
		
		
	}
	
}
