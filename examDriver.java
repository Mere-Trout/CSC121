import java.util.Scanner;
public class examDriver 
{
	static char [][]userAnswers = new char[5][4];
	static Scanner keyboard = new Scanner(System.in);
	static char input;
	static int row2=0;
	
	
	static boolean notValid= true;
	public static void main(String args[])
	{
		for(int column = 0; column<userAnswers[column].length; column++)
		{
			
		for(int row = 0; row<userAnswers.length;row++)
		{
		do 
		{
			System.out.print("\nPlease enter(A,B,C,D): ");
			input = keyboard.next().charAt(0);
			if(input=='A' ||input=='B' || input== 'C' || input=='D')
			{
				notValid=false;
			}
			else
			{
				notValid=true;
				System.out.println("Error: invalid input");
			}
			
			
		}
		while(notValid);
		userAnswers[row][column] = input;
		row2+=1;
		}
		
		}
		DriverExam user1 = new DriverExam(userAnswers);
		
		System.out.println("\nThe total number of question you got correct was "+user1.totalCorrect()+" out of 20");
		System.out.println("The total number that you got wrong was "+ user1.totalIncorrect());
		System.out.println("The questions that you got wront were "+ user1.questionsMissed());
	}

}
