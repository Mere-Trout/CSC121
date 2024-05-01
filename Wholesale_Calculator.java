import java.util.Scanner;

public class Wholesale_Calculator 

{
 public static void main(String args[])
 {
	 
	 intro();
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 public static double wholesaleCost(double cost, double percentage)
 {
	 double total = cost+ (cost*(percentage/100));
	 return total;
 }
 public static void intro()
 {
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("This is a program that calculates retail price. ");
	 
	 System.out.print("\n\nPlease enter the cost of the item ");
	 double cost = keyboard.nextDouble();
	 
	 System.out.print("\n\nPlease enter the markup percentage(enter whole number): ");
	 double percentage = keyboard.nextDouble();
	 
	 System.out.println("\nYour items retail price is $"+wholesaleCost(cost,percentage));
 }

}
