
import java.util.Scanner;



public class internetService 
{
	public static void main(String args[])
	{
		
		int hours;
		double bill;
		String choice;
		
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.println("Internet Service Packages:");
		
		System.out.println("Package A:\tFor $9.95 per month 10 hours of access are provided. Aditional hours\n\t\tare $2.00 per hour\n");
		System.out.println("Package B:\tFor $13.95 per month 20 hours of access are provided. Aditional hours\n\t\tare $1.00 per hour\n");
		System.out.println("Package C:\tFor $19.95 per month unlimited access is provided \n");
		
		System.out.print("Which package would you like? ");
		choice = keyboard.nextLine();
		
		
		
		System.out.print("\nHours used: ");
		hours =keyboard.nextInt();
		
		if (choice.equals("a")||choice.equals("A"))
		{
			switch (hours)
			{
			case 1:
				System.out.println("\nYour bill: $9.95");
			case 2:
				System.out.println("\nYour bill: $9.95");
			case 3:
				System.out.println("\nYour bill: $9.95");
			case 4:
				System.out.println("\nYour bill: $9.95");
			case 5:
				System.out.println("\nYour bill: $9.95");
			case 6:
				System.out.println("\nYour bill: $9.95");
			case 7:
				System.out.println("\nYour bill: $9.95");
			case 8:
				System.out.println("\nYour bill: $9.95");
			case 9:
				System.out.println("\nYour bill: $9.95");
			case 10:
				System.out.println("\nYour bill: $9.95");
			default:
				System.out.println("\nYour bill: $"+(+((double)(hours-10)*2)+9.95));
				
			}
		}
		else if (choice.equals("b")||choice.equals("B"))
		{
			if (hours>20)
			{
				System.out.println("\nYour bill: $"+(+((double)(hours-20)*1)+13.95));
			}
			else
			{
				System.out.println("\nYour bill: $13.95");
			}
		}
		else if (choice.equals("c")||choice.equals("C"))
		{
			System.out.println("\nYour bill: $19.95 ");
		}
		
			
			
		
		
	}
}
