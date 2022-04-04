
package Inheritence;

public class Person {
	//Inheritence
	
	
	private String name;
	private int age;
	private String address;
	
	public Person()
	{
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("Person Constructor");
	}
	
	public Person(String name,int age,String address)
	

	{
		
		//java can default can only call constructor without parameters 
				//so super keyword is needed to call parameter constructor
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println(name);
	}
	
}
