package oopsInterface;

public class Employee extends Person implements Artist,Player{
	public void doSomething() {
		System.out.println("An Employee works to lead his life");
	}
	public void doArt()
	{
		System.out.println("Perform the art you know!");
		
	}
	public void doPlay()
	{
		System.out.println("Tournment coming up!Hurry and pull up the socks");
	}
	public void do1()
	{
		System.out.println("Implementing doable method");
	}
	

}
