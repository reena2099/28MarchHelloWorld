package methodExample;

public class Calculator {
	
	int x;
	int y;
	
	//accepts nothing returns nothing
	public void sum()
	{
		System.out.println("The sum is "+(x+y));
	}
	
	//accepts nothing returns something
	
	public int sum1()
	{
		return (x+y);
	}
	
	
	//accepts something returns saomething
	public int sum2(int a,int b)
	
	{
		return (a+b);
	}

}
