import java.util.Scanner;

public class RainFall 
{
	static double rain;
	static double totalRain = 0;
	static double averageRain;
	static String monthName;
	static int months = 12;
	static int monthholder;
	static double rainydays;
	static double[] amountofRain = new double[12];
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String args[])
	{
		
		program();
		
	}
	
	
	public static void program()
	{
		System.out.println("This is a program that takes in the amount of rainfall ");
		for(int month = 0; month<months; month++)
		{
			monthholder = month;
			System.out.print("\nPlease enter the amount of rainfall for "+monthofyear(monthholder)+": ");
			rain =keyboard.nextDouble();
			amountofRain[month]=rain;
		}
		System.out.println("\n\nRain Readout");
		System.out.println("__________________");
		monthprintout();
		System.out.println("\nThe total amount of rain is "+totalamountofRain());
		System.out.println("The average amount of rain is "+String.format("%.2f",averageamountofRain(totalamountofRain())));
		System.out.println("The month with the greatest amount of rain is "+monthwithmostRain());
		System.out.println("The mont with the least amount of rain is "+monthwithleastRain());
	}
	public static void monthprintout()
	{
		for(int month = 0; month<months; month++)
		{
			
			System.out.println(amountofRain[month]+" <---"+monthofyear(month));
		} 
	}
	public static double totalamountofRain()
	{
		for(int month = 0; month<months; month++)
		{
			totalRain +=amountofRain[month];
			
		} 
		return totalRain;
	}
	public static double averageamountofRain(double j)
	{
		double average = j/12;
		return average;
	}
	public static String monthwithmostRain()
	{
		String mont="";
		double save=0;
		int greatest;
		
		
		for(int month =0,month2=11; month<12;month++,month2--)
		{
			if (amountofRain[month]>save)
			{
				save = amountofRain[month];
				greatest =month;
				mont = monthofyear(month);
			}
			
			
			
		}
		
		
		
		return mont;
	}
	public static String monthwithleastRain()
	{
		int jah = 11;
		String mont="";
		double save=amountofRain[jah];
		int greatest;
		double abloh;
		
		
		for(int month =0,month2=11; month<12;month++,month2--)
		{
			--jah;
			if (amountofRain[month]<amountofRain[month2] && amountofRain[month]<save)
			{
				save = amountofRain[month];
				greatest =month;
				mont = monthofyear(greatest);
			}
			else if (amountofRain[month2]<amountofRain[month] && amountofRain[month2]<save)
			{
				save = amountofRain[month2];
				greatest =month2;
				mont = monthofyear(greatest);
			}
			
			
			
			
			
			
		}
		
		
		
		return mont;
	}
	public static String monthofyear(int m)
	{
		switch(m)
		{
		case 0:
			monthName = "January";
			break;
			
		case 1:
			monthName = "February";
			break;
			
		case 2:
			monthName = "March";
			break;
			
		case 3:
			monthName = "April";
			break;
			
		case 4:
			monthName = "May";
			break;
		case 5:
			monthName = "June";
			break;
		case 6:
			monthName = "July";
			break;
		case 7: 
			monthName = "August";
			break;
		case 8:
			monthName = "September";
			break;
		case 9:
			monthName = "October";
			break;
		case 10: 
			monthName = "November";
			break;
		case 11:
			monthName = "December";
			break;
		default:
			monthName = "Error";
			break;
			
		}
		return monthName;
	}
}
