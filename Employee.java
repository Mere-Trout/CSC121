
public class Employee 
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	
	
	
	
	public Employee(String n, int I, String de, String po)
	{
		name =n;
		idNumber = I;
		department = de;
		position = po;
	}
	public Employee()
	{
		name ="";
		idNumber = 0;
		department = "";
		position = "";
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setIDnumber(int ID)
	{
		idNumber = ID;
	}
	public int getIDnumber()
	{
		return idNumber;
	}
	public void setDepartment(String dept)
	{
		department = dept;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setPosition(String pos)
	{
		position = pos;
	}
	public String getPosition()
	{
		return position;
	}
	
}
