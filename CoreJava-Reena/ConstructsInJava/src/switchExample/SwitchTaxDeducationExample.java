package switchExample;

public class SwitchTaxDeducationExample {

	public static void main(String[] args) {
		double salary = 1100000;
		int category;
		double sat,deduction;
		if(salary <=600000)
		{
			category = 10;
		}
		else if(salary <= 1000000)
		{
			category = 20;
		}
		else
		{
			category = 30;
		}
		switch(category) {
		case 10:
		
				deduction = (salary*10)/100;
				sat = salary - deduction;
				
			System.out.println("Your  salary after tax "+sat);
		    break;
		case 20:
			deduction = (salary*20)/100;
			sat = salary - deduction;
			
			System.out.println("Your  salary after tax "+sat);
		    break;
		case 30:
			deduction = (salary*30)/100;
			sat = salary - deduction;
			
			System.out.println("Your  salary after tax "+sat);
			break;
		default:
			System.out.println("No Tax deduction");

	}

}
}
