import java.util.Scanner;



public class userTriangle 
{
	public static void main(String args[])
	{
		int user = 0;
		String x ="X";
		String x2="X";
		String space = "";
		String space2 = "";
		Scanner keyboard = new Scanner(System.in);
		String tab = "\t";
		
		
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
		
		System.out.println("    "+x);
		
		for(int count = 0; count<=3; count++)
		{
			space+="   ";
			System.out.print(space+x);
			
			if (count==)
			
			
			for(int count2 = 0; count<=2;count++)
			{
				space2+=" ";
				System.out.println(space2+x);
				
			}
			

			
			
			
			
			
			
			
			/*
			String[] Joe = new String[count];
			
			String []joe = {"     X","    X X","   X   X","  X     X"," XXXXXXXXX"};
			
			System.out.println(joe[count]);
			*/
			
		}
		for(int zoe=0; zoe<=8; zoe++)
		{
		System.out.print("X");
		}
		
	}
}
