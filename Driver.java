
public class Driver 
{
	public static void main(String args[])
	{
		Employee susan = new Employee("Susan Meyers",47899,"Accounting","Vice President");
		Employee mark  = new Employee();
		Employee joy = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
		
		//Creates an employee object with the susan reference variable
		
		
		//Doing the same thing using a constuctor
		
		
		
		mark.setName("Mark Jones");
		mark.setIDnumber(39119);
		mark.setDepartment("IT");
		mark.setPosition("Programmer");
		
		
		
		
		
		System.out.println("Name\tID Number\tDepartment\tPosition");
		for(int i =0; i!=50;i++)
		{
			System.out.print("-");
		}
		
		System.out.println("\n"+susan.getName()+"\t"+susan.getIDnumber()+"\t"+susan.getDepartment()+"\t"+susan.getPosition());
		System.out.println(mark.getName()+"\t"+mark.getIDnumber()+"\t"+mark.getDepartment()+"\t\t"+mark.getPosition());
		System.out.println(joy.getName()+"\t"+joy.getIDnumber()+"\t"+joy.getDepartment()+"\t"+joy.getPosition());
		
		
		
		
		
		
		
		
		
	}
}
