package whileDoWhile;

import java.util.Scanner;

public class SimpleInterestDoWhile {

	public static void main(String[] args) {
		
		
		 
		 double SI;
		 int time=0;
		Scanner sc=new Scanner(System.in);
	
		 System.out.println("enter rate");
		 int rate = sc.nextInt();
		 System.out.println("enter principle amount");
		 int principle = sc.nextInt();
		 System.out.println("enter interest you require");
		 int wanted_si = sc.nextInt();
		  
		  
		  
		 
		// SI = (principal * rate * time)/100;
		 
		  
		//  System.out.println("The Simple Interest is "  + SI);
		 while(wanted_si != 100000)
		 
		  
		  {
			  
			  wanted_si = (principle * rate * time)/100;
			  time++;
			  
		  }
		  
		  System.out.println("time taken "+time);
		  
		
		  
		  
		  
	}

}
