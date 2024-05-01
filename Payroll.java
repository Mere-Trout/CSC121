import java.util.Scanner;
public class Payroll 
{
static int[] employeeID = {5658845,4520125 ,7895122, 8777541,8451277,1302850,7580489};
static int[] hours = new int[7];
static double[] payRate = new double [7];
static double[] wages = new double[7];
static Scanner keyboard  = new Scanner(System.in);
static int idNum;
static boolean validNum;
static int currentUser;
static int num = 0;
static int hrs;
static double wage;
static double totalPay;


public static void main(String args[])
{
	currentUser = idVerification();
	hourInput(currentUser);
	wageInput(currentUser);
	grossWage(currentUser);
}

public static void wageInput(int w)
{
	System.out.print(employeeID[w]+": Please enter your hourly wage ");
	wage = keyboard.nextDouble();
	wages[w] = wage;
}

public static void grossWage(int j)
{
	System.out.println("\nYour total amount of pay should be "+(wages[j]*hours[j]));
}
public static void hourInput(int usr)
{
	do 
	{
	System.out.print(employeeID[usr]+": Please enter the number of hours you've worked ");
	hrs = keyboard.nextInt();
	if (hrs<0 || hrs<6)
	{
		System.out.println("\nError: Hours cannot be negative or less than 6");
	}
	}
	while(hrs<0 || hrs<6);
	hours[usr] = hrs;
}

public static int idVerification()
{
	do 
	{
		
	System.out.print("Please enter you employee number ");
	idNum = keyboard.nextInt();
	
	for(int i = 0; i<employeeID.length; i++)
	{
		if(idNum==employeeID[i])
		{
			validNum = true;
			num = i;
			break;
		}
		else
		{
		validNum = false;
		}
		
	}
	if(!validNum)
	{
		System.out.println("\nError: Employee number not valid ");
	}
	}
	while(!validNum);
	return num;
	
}

}

