
public class car 

{
	private int modelYear;
	private int speed;
	private String make;
	private String model;
	
	public void setModel(String m)
	{
		model = m;
	}
	public String getModel()
	{
		return model;
	}
	public void setModelyear(int i)
	{
		modelYear = i;
	}
	public int getModelyear()
	{
		return modelYear;
	}
	public void setSpeed(int s)
	{
		speed = s;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setMake(String s)
	{
		make = s;
	}
	public String getMake()
	{
		return make;
	}
	public void accelerate()
	{
		speed+=5;
	}
	public void brake()
	{
		speed-=5;
	}
}
