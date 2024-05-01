import java.util.Random;
public class LetsPlayWithArrays 
{
private int[] array;
private Random rand = new Random();
	public LetsPlayWithArrays(int size)
	{
		array = new int[size];
		fillandCopy(array, size);
		
	}
	public void fillandCopy(int[] arr, int s)
	{
		for(int i = 0; i<s; i++)
		{
			arr[i] = rand.nextInt(100);
		}
		int[] newArray = new int[s];
		for(int index = 0; index<s; index++)
		{
			newArray[index] = arr[index];
		}
		print(newArray,s);
	}
	public void print(int[] ar, int si)
	{
		int divThree = 0;
		for(int index = 0; index<si; index++)
		{
			if(ar[index]%3==0)
			{
				divThree+=1;
			}
			System.out.println((index+1)+". "+ar[index]);
		}
		System.out.println("The total amount of numbers that are divisible by three is "+divThree);
	}
}
