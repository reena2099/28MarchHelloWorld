package abstraction;

public abstract class Person {
	
	private String name;
	private int age;
	private String address;
	
	public Person()
	
	
	{
		
	}
	
	public  abstract void doSomething();
	
	public void talk()
	{
		System.out.println("All Persons can't talk");
	}

}
