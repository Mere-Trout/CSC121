import java.util.Scanner;





public class midtermPractice 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		int num=0;
		int big=0;
		int small=0;
		boolean active = true;
		
		while(num!=-99)
		{
			System.out.print("Please enter some numbers(-99 when done):  ");
			num = keyboard.nextInt();
			if(num==-99)
			{
				break;
			}
			
			if (num>big)
			{
				big = num;
			}
			if (num<small)
			{
				small =num;
			}
			
		}
		
		System.out.println("\nThe biggest number you entered was "+big);
		
		System.out.println("\nThe smallest number you entered was "+small);
		
		
		
		
	}
}
