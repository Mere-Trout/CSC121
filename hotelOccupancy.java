
import java.util.Scanner;

public class hotelOccupancy 

{
public static void main(String args[])
{
	int roomsOccupied;
	int roomsUsedSaved = 0;
	int	roomsSaved=0;
	int rooms;
	double occupancyRate=0;
	int floors=0;
	
	Scanner keyboard = new Scanner(System.in);
	
	do 
	{
		
		System.out.print("Please enter the amount of floors ");
		floors = keyboard.nextInt();
		
		if (floors<1)
		{
			System.out.println("\nThe number of floors cannot be less than 1 \n");
		}
		
	}
	while(floors<1);
	
	for(int count = 1; count<=floors;count++)
	{
		do
		{
			System.out.print("Enter the amount of rooms on floor "+count+": ");
			rooms = keyboard.nextInt();
			if (rooms<10)
			{
				System.out.println("\nThe number of rooms cannot be less than 10 \n");
			}
			
		}
		while(rooms<10);
		
		System.out.print("\nHow many of these rooms are occupied? ");
		roomsOccupied = keyboard.nextInt();
		
		roomsUsedSaved+=roomsOccupied;
		roomsSaved+=rooms;
		
			
	}
	occupancyRate = 100*((double)roomsUsedSaved/(double)roomsSaved);
	
	System.out.println("__________________________");
	System.out.println("There are rooms "+roomsSaved);
	System.out.println("There are "+roomsUsedSaved+" rooms occupied ");
	System.out.println("There are "+(roomsSaved-roomsUsedSaved)+" available");
	System.out.printf("The occupany rate is %.2f",occupancyRate);
	
}
}
