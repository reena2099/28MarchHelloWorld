package Inheritence;

public class Querty extends Mobile{
	
	
	public String model;
	
	

	public Querty(String name,int id,String brand,int version,String color,int release_date,String model)
	{
		
		//java can default can only call constructor without parameters 
				//so super keyword is needed to call parameter constructor
		super(name,id,brand,version,color);
	     this.model=model;
	     System.out.println("***********Querty****************");
	    System.out.println("From Querty Class");
		System.out.println(name);
		System.out.println(id);
		System.out.println(brand);
		System.out.println(version);
		System.out.println(model);
		System.out.println("****************************");
	}

}
