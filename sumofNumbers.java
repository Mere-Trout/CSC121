import java.util.Scanner;
public class sumofNumbers 
{

	public static void main(String args[])
	{
	
		
	Scanner keyboard = new Scanner(System.in);
	
	int num = 0;
	int count = 0;
	int save = 0;
	System.out.print("Please enter the number you want the sum of all values for: ");
	num= keyboard.nextInt();
	
	
	
	while (num<1)
	{
		System.out.print("\nPlease enter a number thats greater than zero...");
		num = keyboard.nextInt();
		
		
		
	}
		
	while (save!=num)	
	{
	save++;
	count+=save;	
	}
	
	System.out.println("The sum of all the values up to "+num+" is "+count);
		
	}
	
	
	
	
}
