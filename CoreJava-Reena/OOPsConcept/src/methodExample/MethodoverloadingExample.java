package methodExample;

public class MethodoverloadingExample {

	int x;
	int y;
	
	//Overloading
	//We can have multiple methods with same name
	//different order of parameters
	//different no.of parameters
	//different type of parameters
	//return type is not considered
	
	
	public void sum(int a,int b) {
		System.out.println(a+b);
		
	}
	public void sum(int a ,int b,int x)
	{
		System.out.println("3 numbers addition "+(a+b+x));
	}
	public void sum(int a,float b)
	{
		System.out.println((float)a+b);
	}
	public void sum(float a,int b)
	{
		System.out.println((int)a+b);
	}
}
