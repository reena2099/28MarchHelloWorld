package methodExample;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.x=10;
		cal.y=20;
		cal.sum();
		int result=cal.sum1();
		System.out.println("Adding of two numbers through storing "+result);
		System.out.println("The sum through call directly "+cal.sum1());
		
		int result2=cal.sum2(11,1);
		System.out.println("Adding of two numbers through storing "+result2);
		System.out.println("The result through call directly "+cal.sum2(2,3));
		 MethodoverloadingExample m1=new  MethodoverloadingExample();	
		
	System.out.println("Overloading Example");
	m1.sum(10,30);
	m1.sum(12.55f,13);
	m1.sum(10,30,40);
    m1.sum(12,13.55f);
	
	}

}
