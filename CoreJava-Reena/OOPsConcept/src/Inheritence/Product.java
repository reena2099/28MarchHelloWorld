package Inheritence;

public class Product {
	private String name;
	private int id;
	
	

	
	public Product(String name,int id)
	

	{
		
		//java can default can only call constructor without parameters 
				//so super keyword is needed to call parameter constructor
		this.name=name;
		this.id=id;
		System.out.println("************Product***************");
		System.out.println(name+"//"+id+"From Product Class");
		System.out.println("****************************");
	}

}
