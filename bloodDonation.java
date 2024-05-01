import java.util.Scanner;

public class bloodDonation 
{
	static int O = 2;
	static int B = 4;
	static int A = 2;
	static int AB =3;
	static int amount = 0;
	static String password = "password";
	static String input ="";
	static String attempt = "";
	static String bloodType = "";
	static boolean runTime = true;
	static boolean runTime2 = true;
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String args[])
	{
		
		program();
		
	}
	public static void admin()
	{
		
	
		do
		{
		System.out.print("Please enter the admin password: ");
		input = keyboard.nextLine();
		if (!input.equals(password))
		{
			System.out.println("Error: incorrect password ");
		}
		}
		while(!input.equals(password));
		System.out.println("\nHello Admin.");
		bloodBank();
	}

	public static void bloodBank()
	{
		System.out.println("Blood Bank:");
		System.out.println("Type O - "+O+ " packets.");
		System.out.println("Type A - "+A+ " packets.");
		System.out.println("Type B - "+B+ " packets.");
		System.out.println("Type AB - "+AB+ " packets.");
	}

	public static void patient()
	{
		boolean valid = true;
		System.out.println("Hello,");
		
		System.out.print("Please enter your blood type, O, A, B, AB ");
		bloodType = keyboard.nextLine();
		
		if (bloodType.equals("O")&& O==0)
		{
			System.out.println("There is no blood for that blood type");
			valid = false;
			
			
		}
		else if (bloodType.equals("A")&& A==0)
		{
			System.out.println("There is no blood for that blood type");
			valid = false;
			
			
		}
		else if (bloodType.equals("B")&& B==0)
		{
			System.out.println("There is no blood for that blood type");
			valid = false;
			
			
		}
		else if (bloodType.equals("AB")&& AB==0)
		{
			System.out.println("There is no blood for that blood type");
			valid = false;
			
			
		}

		
		
		
		
		if (valid)
		{
		
		
		switch (bloodType)
		{
		case "O":
			do
			{
			System.out.print("\nHow many packets of blood would you like");
			amount = keyboard.nextInt();
			keyboard.nextLine();
			if ( amount>1)
			{
				System.out.println("Error: You can only borrow one blood packet ");
			}
			}	
			while( amount>1);
			O-=amount;
			break;
		case "A":
			do
			{
			System.out.print("\nHow many packets of blood would you like");
			amount = keyboard.nextInt();
			keyboard.nextLine();
			if ( amount>1)
			{
				System.out.println("Error: You can only borrow one blood packet ");
			}
			}	
			while( amount>1);
			A-=amount;
			break;
		case "B":
			do
			{
			System.out.print("\nHow many packets of blood would you like");
			amount = keyboard.nextInt();
			keyboard.nextLine();
			if ( amount>1)
			{
				System.out.println("Error: You can only borrow one blood packet ");
			}
			}	
			while( amount>1);
			B-=amount;
			break;
		case "AB":
			do
			{
			System.out.print("\nHow many packets of blood would you like");
			amount = keyboard.nextInt();
			keyboard.nextLine();
			if ( amount>1)
			{
				System.out.println("Error: You can only borrow one blood packet ");
			}
			}	
			while( amount>1);
			AB-=amount;
			break;
		}
		}
		
		
	}

	public static void donor()
	{
		System.out.println("Hello,");
		System.out.print("Please enter your blood type, O, A, B, AB ");
		bloodType = keyboard.nextLine();
		
		do 
		{
			System.out.print("\nHow many packets of blood would you like to donate? 1,2, or 3 packets?");
			amount = keyboard.nextInt();
			keyboard.nextLine();
			if (amount>3)
			{
				System.out.println("\nError: cannot donate more than 3 packets of blood");
			}
		}
		while(amount>3);
		switch (bloodType)
		{
		case "O":
			O+=amount;
			break;
		case "A":
			A+=amount;
			break;
		case "B":
			B+=amount;
			break;
		case "AB":
			AB+=amount;
			break;
			
			
		}
	}
	public static void program()
	{
		do
		{
		do
		{
		System.out.println("Please enter your role(patient, donor, admin): ");
		input = keyboard.nextLine();
		switch (input)
		{
		case "patient":
			patient();
			runTime = false;
			break;
		case "donor":
			runTime = false;
			donor();
			break;
		case "admin":
			runTime = false;
			admin();
			break;
		default:
			System.out.println("Error: role not found");
			break;
		}
		}
		while(runTime);
		
		System.out.println("\nWould you like to run the program again?(y/n): ");
		
		input = keyboard.nextLine();
		
		switch (input)
		{
		case "y":
			runTime = true;
			break;
		case "n":
			runTime2 = false;
			System.out.println("Have a great day!");
			break;
		default:
			System.out.println("Error: invalid input");
			break;
		}
		}
		while(runTime2);
	}

}

