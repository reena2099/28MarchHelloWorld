package org;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  
		  
		  System.out.println("Enter your Principle amount");
		  double principle = sc.nextDouble();
		  
		  System.out.println("Enter the rate");
		  double rate = sc.nextDouble();
		  
		  System.out.println("Enter the years");
		  double time = sc.nextDouble();
		  
		  double SI;
		  
		  SI = (principle * rate * time)/100;
		  
		  System.out.println("The Simple Interest is "  + SI);
		  
		  
		  
	}

}
