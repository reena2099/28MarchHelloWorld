package org;

import java.util.Scanner;

public class ArrayMultiplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] nums= new int[size];
		System.out.println("Enter the values in array");
		for(int i=0;i<size;i++)
		{
			 nums[i]=sc.nextInt();
			
 		}
		
		System.out.println("After multiplication");
		
		int[] ans=new int[size];
		for(int i=0;i<size;i++)
		{
			
			 ans[i] = nums[i]*2;
			System.out.println(ans[i]);
			
 		}	

	}

}
