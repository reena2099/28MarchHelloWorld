package Inheritence;

public class Manager extends Employee {
	
	String dept;
	public Manager()
	{
		System.out.println("Manager constructor");
	}
	
	public Manager(String name,int age,String address,int empId,String dept)
	{
		
		//java can default can only call constructor without parameters 
				//so super keyword is needed to call parameter constructor
		super(name,age,address,empId);
		this.dept=dept;
		System.out.println(dept);
		
	}

}
