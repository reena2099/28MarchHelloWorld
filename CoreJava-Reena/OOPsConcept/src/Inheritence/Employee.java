package Inheritence;

public class Employee extends Person {

	
public int empId;
public Employee()

{
	System.out.println("Employee constructor");
}

public Employee(String name,int age,String address,int empId)
{
	
	//java can default can only call constructor without parameters 
			//so super keyword is needed to call parameter constructor
	super(name,age,address);
	this.empId=empId;
	System.out.println(age);
	
}
}
