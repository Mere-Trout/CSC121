import java.util.Scanner;
import java.util.Random;
public class twoDArrayOperations 
{
	static	int[][] array = new int[5][5];
	static Random rand = new Random();
	static int total = 0;
	static int average = 0;
	static int highest;
	static int lowest;
	static int rowTotal = 0;
	static int columnTotal =0;
	static int rowSelection;
	static int columnSelection;
	static Scanner keyboard = new Scanner(System.in);
public static void main(String args[])
{
	fillingArray();
	System.out.println("\nThe total of all the elements in this array is "+getTotal(array));
	System.out.println("The average of all the elements in this array is "+getAverage(array));
	do
	{
	System.out.print("Which row would you like to get the sum of? ");
	rowSelection = keyboard.nextInt();
	if(rowSelection>array.length)
	{
		System.out.println("\nError: value exceeds number of rows \n");
	}
	}
	while(rowSelection>array.length);
	System.out.println("The total of of all the elements in row "+rowSelection+" is "+getRowTotal(array,(rowSelection-1)));
	
	do
	{
	System.out.print("Which column would you like to get the sum of? ");
	columnSelection = keyboard.nextInt();
	if(columnSelection>array[0].length)
	{
		System.out.println("\nError: value exceeds number of columns \n");
	}
	}
	while(columnSelection>array[0].length);
	System.out.println("The total of of all the elements in row "+columnSelection+" is "+getColumnTotal(array,(columnSelection-1)));
	
	do
	{
	System.out.print("\nWhich row would you like to get the highest number out of? ");
	rowSelection = keyboard.nextInt();
	if(rowSelection>array.length)
	{
		System.out.println("\nError: value exceeds number of rows \n");
	}
	}
	while(rowSelection>array.length);
	
	System.out.println("The highest number in row "+rowSelection+" is "+getHighestInRow(array,(rowSelection-1)));
	
	do
	{
	System.out.print("\nWhich row would you like to get the lowest number out of? ");
	rowSelection = keyboard.nextInt();
	if(rowSelection>array.length)
	{
		System.out.println("\nError: value exceeds number of rows \n");
	}
	}
	while(rowSelection>array.length);
	
	System.out.println("The lowest number in row "+rowSelection+" is "+getLowestInRow(array,(rowSelection-1)));
}
public static void fillingArray()
{
	for (int row = 0; row<array.length; row++)
	{
		for(int column = 0; column<array[row].length; column++) 
		{
			array[row][column] = rand.nextInt(50);
			System.out.print(array[row][column]+" ");
		}
		System.out.print("\n");
	}
}
public static int getTotal(int ar[][])
{
	total=0;
	for (int row = 0; row<ar.length; row++)
	{
		for(int column = 0; column<ar[row].length; column++) 
		{
			total+=ar[row][column];
		}
	}
	return total;
}
public static int getAverage(int ar[][])
{
	total = 0;
	for (int row = 0; row<ar.length; row++)
	{
		for(int column = 0; column<ar[row].length; column++) 
		{
			total+=ar[row][column];
		}
	}
	average = total/(ar.length*ar[0].length);
	
	return average;
}
public static int getRowTotal(int ar[][], int selectRow)
{
	
	
		for(int column = 0; column<ar[selectRow].length; column++) 
		{
			rowTotal+=ar[selectRow][column];
		}
		return rowTotal;
	
		
}

public static int getColumnTotal(int ar[][], int selectColumn)
{
	for(int row = 0; row<ar[selectColumn].length; row++) 
	{
		columnTotal+=ar[row][selectColumn];
	}
	return columnTotal;
}
public static int getHighestInRow(int ar[][], int r)

{
	int save=0;
	for(int column = 0; column<ar[r].length; column++) 
	{
		if(ar[r][column]>save)
		{
			save = ar[r][column];
		}
	}
	
	return save;
}
public static int getLowestInRow(int ar[][], int r)
{
	int save=50;
	for(int column = 0; column<ar[r].length; column++) 
	{
		if(ar[r][column]<save)
		{
			save = ar[r][column];
		}
	}
	
	return save;
}







}
