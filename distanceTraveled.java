import java.util.Scanner;

public class distanceTraveled 
{
public static void main(String args[])
{
	int speed; 
	int time;
	
	
	Scanner keyboard = new Scanner(System.in);
	
	
	
do
{
	System.out.print("Please enter the Speed(MPH): ");
	speed = keyboard.nextInt();
	if (speed<0)
	{
		System.out.println("\nError: Speed cannot be negative!\n");
	}
}
while(speed<0);

do
{
	
	System.out.print("Please enter the amount of time it took to travel(hours): ");
	time = keyboard.nextInt();
	if (time<1)
	{
		System.out.println("\nError: Time cannot be less than 1! \n");
	}
	
}
while(time<1);


System.out.println("\nHour\tDistance Traveled");
System.out.println("-------------------------------");

for(int count =1; count<=time; count++)
{
	int distance = speed *count;
	System.out.println(count+"\t\t"+distance);
	
	
}
	
}
}
