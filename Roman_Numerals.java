import java.util.Scanner;
public class Roman_Numerals 
{
	public static void main(String args[])
	{
	int number;
	boolean condition = true;
	String one ="I";
	String two = "II";
	String three= "III";
	String four = "IV";
	String five = "V";
	String six = "VI";
	String seven = "VII";
	String eight = "VIII";
	String nine = "IX";
	String ten = "X";
	
	
	
	
	Scanner Keyboard = new Scanner(System.in);
	
	
	while(condition)
	{
	System.out.println("Please enter a number 1-10 ");
	number = Keyboard.nextInt();
	if (number == 1)
	{
	System.out.println("Your number in roman numerals: "+one);
	condition = false;
	}
	
	else if(number == 2)
	{
	System.out.println("Your number in roman numerals: "+two);	
	condition = false;
	}
	
	else if(number ==3)
	{
	System.out.println("Your number in roman numerals: "+three);
	condition = false;
	}
	
	else if (number ==4)
	{
	System.out.println("Your number in roman numerals: "+four);	
	condition = false;
	}
	
	else if (number ==5)
	{
		System.out.println("Your number in roman numerals: "+five);
		condition = false;
	}
	
	else if (number ==6)
	{
		System.out.println("Your number in roman numerals: "+six);
		condition = false;
	}
	
	else if (number ==7)
	{
		System.out.println("Your number in roman numerals: "+seven);
		condition = false;
	}
	
	else if (number ==8)
	{
		System.out.println("Your number in roman numerals: "+eight);
		condition = false;
	}
	
	else if (number ==9)
	{
		System.out.println("Your number in roman numerals: "+nine);
		condition = false;
	}
	
	else if (number ==10)
	{
		System.out.println("Your number in roman numerals: "+ten);
		condition = false;
		
	}
	
	else
	{
		System.out.print("ERROR: You didn't enter a number 1-10");
	}
	
	}
	
	
	
}
	

}



