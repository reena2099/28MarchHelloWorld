package org;

public class StarShapeExample {

	public static void main(String[] args) {
		int row=3, i, j, space = 1;  
		  
		space = row - 1;  
		for (j = 1; j<= 3; j++)  
		{  
		for (i = 1; i<=space ; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= row - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (row - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  

	}
}
