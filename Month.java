
public class Month 
{
	private int monthNumber;
	public Month()
	{
		monthNumber = 0;
	}
	public Month(int num)
	{
		if (num>12)
		{
			monthNumber = 1;
		}
		else if (num<1)
		{
			monthNumber = 1;
		}
		else
		{
			monthNumber = num;
		}
	}
	public Month(String mon)
	{
		switch(mon)
		{
		case "January":
			monthNumber =1;
		case "February":
			monthNumber =2;
		case "March":
			monthNumber =3;
		case "April":
			monthNumber = 4;
		case "May":
			monthNumber =5;
		case "June":
			monthNumber =6;
		case "July":
			monthNumber =7;
		case "August":
			monthNumber =8;
		case "September":
			monthNumber =9;
		case "October":
			monthNumber =10;
		case "November":
			monthNumber =11;
		case "December":
			monthNumber =12;
		default:
			monthNumber=1;
		}
	}
	public void setMonthNumber(int input)
	{
		if (input>12)
		{
			monthNumber = 1;
		}
		else if (input<1)
		{
			monthNumber = 1;
		}
		else
		{
			monthNumber = input;
		}
	}
	public int getMonthNumber()
	{
		return monthNumber;
	}
	public String getMonthName()
	{
	switch(monthNumber)
	{

	
	case 1:
		return "January";
	case 2:
		return "February";
	case 3:
		return "March";
	case 4:
		return  "April";
	case 5:
		return "May";
	case 6:
		return "June";
	case 7:
		return "July";
	case 8:
		return "August";
	case 9:
		return "September";
	case 10:
		return "October";
	case 11:
		return "November";
	case 12:
		return "December";
	default:
		return "January";
	}
	}
	public String toString()
	{
		return getMonthName();
	}
	public boolean equals(Month b)
	{
		if (monthNumber==b.getMonthNumber())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
