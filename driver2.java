
public class driver2 
{
	public static void main(String args[])
	{
		
	car myCar = new car();
	
	myCar.setMake("Volkswagen");
	myCar.setModel("Jetta");
	myCar.setModelyear(2015);
	myCar.setSpeed(0);
	
	
	System.out.println("The current car that is on the road is a "+myCar.getModelyear()+" "+myCar.getMake()+" "+myCar.getModel());
	
	for(int i = 0; i!=5; i++)
	{
	System.out.println("\nAccelerating . . .");
	myCar.accelerate();
	System.out.println("\nYour current speed is "+myCar.getSpeed());
	
	
	
	}
	for(int i = 0; i!=5; i++)
	{
	System.out.println("\nBraking . . .");
	myCar.brake();
	System.out.println("\nYour current speed is "+myCar.getSpeed());
	
	
	
	}
}
}
