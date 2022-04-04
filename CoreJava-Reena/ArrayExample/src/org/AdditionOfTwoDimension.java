package org;

import java.util.Scanner;

public class AdditionOfTwoDimension {

	public static void main(String[] args) {
		int[][] one=new int[3][3];
		int[][] two=new int[3][3];
		int[][] sum=new int[3][3];
		System.out.println("enter the values of first array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				one[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array one is");
		
		for( int i=0;i<3;i++)
			
		{
			for(int j=0;j<3;j++)
				
				
			{
				System.out.print(one[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("enter the values of second array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				two[i][j]=sc.nextInt();
			}
		}
		
System.out.println("Array two is");
		
		for( int i=0;i<3;i++)
			
		{
			for(int j=0;j<3;j++)
				
				
			{
				System.out.print(two[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("After addition of Arrays");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=one[i][j]+two[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			
			System.out.println();
		
		}
		
	}

}
