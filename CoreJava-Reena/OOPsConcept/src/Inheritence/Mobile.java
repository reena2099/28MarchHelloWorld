package Inheritence;

public class Mobile extends Product{

	
	public String brand;
	public int version;
	public String color;
	

	public Mobile(String name,int id,String brand,int version,String color)
	{
		
		//java can default can only call constructor without parameters 
				//so super keyword is needed to call parameter constructor
		super(name,id);
		this.brand=brand;
		this.version=version;
		this.color=color;
		
		System.out.println("**********Mobile*****************");
		System.out.println("From Mobile case");
		System.out.println(name);
		System.out.println(id);
		System.out.println(brand);
		System.out.println(version);
		System.out.println(color);
		System.out.println("****************************");
		
	}
	}

