package Inheritence;

public class SmartPhone extends Mobile{
	
	
	public int release_date;
	public String software;
	

	public SmartPhone(String name,int id,String brand,int version,String color,int release_date,String software)
	{
		
		//java can default can only call constructor without parameters 
				//so super keyword is needed to call parameter constructor
		super(name,id,brand,version,color);
		this.release_date=release_date;
		this.software=software;
		System.out.println("*************SmartPhone****************");
	    System.out.println("From SmartPhone Class");
		System.out.println(name);
		System.out.println(id);
		System.out.println(brand);
		System.out.println(version);
		System.out.println(release_date);
		System.out.println(software);
		
		System.out.println("****************************");
	}

}
