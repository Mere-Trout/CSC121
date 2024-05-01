import java.util.Scanner;

public class chargeAccountValidation 
{
static Scanner keyboard = new Scanner(System.in);
static int[][] accounts = {{5658845,4520125, 7895122,8777541,8451277,1302850},
						   {8080152,4562555,5552012,5050552,7825877,1250255},
						   {1005231,6545231,3852085,7576651,7881200,4581002}};


static int input;
static boolean validation;
public static void main(String args[])
{
	System.out.print("Please enter your account number ");
	input =keyboard.nextInt();
	 validation = checkArray(accounts,input);
	 
	 if (validation)
	 {
		 System.out.println("\nYou account number is valid ");
	 }
	 else 
	 {
		 System.out.println("Your account number is not valid ");
	 }
	
}

public static boolean checkArray(int [][]ar,int query)
{
	boolean valid=false; 
	for(int row =0; row<ar.length; row++)
	{
		for(int column = 0; column<ar[row].length; column++)
		{
			if(ar[row][column] == query)
			{
				valid =true;
			}
		}
	}
	return valid;
}

}


