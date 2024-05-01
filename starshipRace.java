import java.util.Scanner;

public class starshipRace 
{
	public static void main(String args[]) 
	{
	String shipOne;
	Double shiponeTime;
	String shipTwo;
	Double shiptwoTime;
	String shipThree;
	Double shipthreeTime;
	
	Scanner keyboard = new Scanner(System.in);
	
	
	System.out.println("This is a program that takes the names and times of three starships and determines who won.");
	
	System.out.print("Please enter the time of the name of the first ship: ");
	shipOne = keyboard.nextLine();
	
	System.out.print("\nPlease enter the time of the name of the second ship: ");
	shipTwo = keyboard.nextLine();
	
	System.out.print("\nPlease enter the time of the name of the third ship: ");
	shipThree = keyboard.nextLine();
	
	//I've finished collecting the names of the ships, next up is the times
	
	System.out.println("\nPlease enter the time for "+shipOne);
	shiponeTime = keyboard.nextDouble();
	
	System.out.println("Please enter the time for "+shipTwo);
	shiptwoTime = keyboard.nextDouble();
	
	System.out.println("Please enter the time for "+shipThree);
	shipthreeTime = keyboard.nextDouble();
	
	if (shiponeTime >= shiptwoTime  && shiponeTime>= shipthreeTime)
	{
		System.out.println(shipOne+" came in 1st place with a time of "+shiponeTime);
		if(shiptwoTime>shipthreeTime)
		{
			System.out.println(shipTwo+" came in 2nd place with a time of "+shiptwoTime);
			System.out.println(shipThree+" came in 3rd place with a time of "+shipthreeTime);
			
		}
		else
		{
			System.out.println(shipThree+" came in 2nd place with a time of "+shipthreeTime);
			System.out.println(shipTwo+" came in 3rd place with a time of "+shiptwoTime);
		}
		
	}
	else if (shiptwoTime >= shiponeTime  && shiptwoTime>= shipthreeTime)
	{
		System.out.println(shipTwo+" Came in 1st place with a time of "+shiptwoTime);
		if(shiponeTime>shipthreeTime)
		{
			System.out.println(shipOne+" came in 2nd place with a time of "+shiponeTime);
			System.out.println(shipThree+" came in 3rd place with a time of "+shipthreeTime);
			
		}
		else
		{
			System.out.println(shipThree+" came in 2nd place with a time of "+shipthreeTime);
			System.out.println(shipOne+" came in 3rd place with a time of "+shiponeTime);
		}
		
	}
	else if (shipthreeTime >= shiptwoTime  && shiponeTime>= shiponeTime)
	{
		System.out.println(shipThree+" Came in 1st place with a time of "+shipthreeTime);
		if(shiptwoTime>shiponeTime)
		{
			System.out.println(shipTwo+" came in 2nd place with a time of "+shiptwoTime);
			System.out.println(shipOne+" came in 3rd place with a time of "+shiponeTime);
			
		}
		else
		{
			System.out.println(shipOne+" came in 2nd place with a time of "+shiponeTime);
			System.out.println(shipTwo+" came in 3rd place with a time of "+shiptwoTime);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
