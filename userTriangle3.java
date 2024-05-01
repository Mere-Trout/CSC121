import java.util.Scanner;

public class userTriangle3 
{
	public static void main(String args[])
	{
		int user = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		String space1="    ";
		String space2 ="";
		String x = "";
		
		
		do
		{
			System.out.print("Please enter a number: ");
			user = keyboard.nextInt();
			if (user!=5)
			{
				System.out.println("\nPlease try again\n");
			}
		}
		while(user!=5);
		
		for(int count = 0; count<=5; count++)
		{
			System.out.println("X");
			for(int count2 = 0; count<=5; count2++)
			{
				
			}
		}
	}

}

