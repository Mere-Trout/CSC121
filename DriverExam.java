
public class DriverExam 
{
	private char[][]correctAnswers = {{'B', 'A', 'B', 'C'}, {'D', 'B', 'C', 'C'},{'A', 'A', 'D', 'B'},{'A','C','A','D' }, {'C','D','D','A'}};
	private char[][]userInput = new char[5][4];
	private int score = 20;
	private int incorrect = 0;
	private int finalScore;
	private int[][] questionsMissed = new int[5][4];
	public DriverExam(char[][]userAnswers)
	{
		for(int row =0; row<userAnswers.length;row++)
		{
			for (int column = 0; column<userAnswers[row].length;column++)
			{
				userInput[row][column]=userAnswers[row][column];
{
	
}
			}
		}
		
	}
	public int totalCorrect()
	{
		for(int row =0; row<userInput.length;row++)
		{
			for (int column = 0; column<userInput[row].length;column++)
			{
				if(userInput[row][column]!=correctAnswers[row][column])
				{
					
					score-=1;
				}
{
	
}
			}
		}
		return score;
	}
	public boolean passed()
	{
		if (score>=15)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int totalIncorrect()
	{
		for(int row =0; row<userInput.length;row++)
		{
			for (int column = 0; column<userInput[row].length;column++)
			{
				if(userInput[row][column]!=correctAnswers[row][column])
				{
					
					incorrect+=1;
				}
{
	
}
			}
		}
		
		return incorrect;
	}
	public int[][] questionsMissed()
	{
		
		int joe =0;
		int questionNum = 1;
		for(int column=0; column<userInput[column].length; column++)
		{
			for(int row =0; row<userInput.length; row++)
			{
				if(userInput[row][column]!=correctAnswers[row][column])
				{
					questionsMissed[row][column] = questionNum;
					
				}
				questionNum++;
			}
		}
		return questionsMissed;
	}
	
	
}
