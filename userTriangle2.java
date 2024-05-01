import java.util.Scanner;

public class userTriangle2 
{
	public static void main(String args[])
	{
		String space1="";
		String space2 ="";
		String x = "X";
		
		int user=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
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
		
		System.out.println("    X");
		for(int count = 1; count<=3; count++)
		{
			switch(count)
			{
			case 1:
				space1="   ";
				space2=" ";
				x = "X";
				break;
			case 2:
				space1 = "  ";
				space2 = "   ";
				x = "X";
				break;
				
			case 3:
				space1=" ";
				space2="     ";
				x = "X";
				break;

			}
		System.out.println(space1+x+space2+x);
		}
		for(int count2=0;count2<=8;count2++)
		{
			System.out.print(x);
		}
		
	}
		
}
