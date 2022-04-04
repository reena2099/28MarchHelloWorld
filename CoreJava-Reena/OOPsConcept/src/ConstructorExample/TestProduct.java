package ConstructorExample;

public class TestProduct {
      public static void main(String[] args) {
		Product p1=new Product();
		p1.name="mobile";
		p1.brand="Oneplus";
		p1.price=2000;
		p1.qty=1;
		
		Product p2=new Product("Tripod","Digitech",0,5);
		System.out.println(p2.name);
		
		Product p3=new Product("Nailposh","Revlon");
		System.out.println(p3.brand);
				
			
	}
	
	
}
