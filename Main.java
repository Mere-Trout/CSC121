
import java.util.Scanner;
import java.io.*;

public class Main
{
    static Scanner keyboard = new Scanner(System.in);
    static int arraySize;
    static int userInput;
    public static void main(String args[])
    {
    	do 
    	{
    	System.out.print("Please enter the size of your array ");
    	userInput = keyboard.nextInt();
    	if (userInput<0 || userInput>1000)
    	{
    		System.out.println("\nError: Size cannot be negative or greater than 1000");
    	}
    	}
    	while(userInput<0 || userInput>1000);
    	
    	LetsPlayWithArrays array = new LetsPlayWithArrays(userInput);
    	
    }
}





