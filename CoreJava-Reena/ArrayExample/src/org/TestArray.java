package org;

public class TestArray {

	public static void main(String[] args) {
		//declare
		String[] names;
		//intantiate
		names = new String[5];
		//initialize
		names[0]="upasana";
		names[1]="prashanth";
		names[2]="ayush";
		names[3]="reena";
		names[4]="uday";
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		String[] cities = {"mumbai","kolkata","bengaluru","delhi","pune"};
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
		
		int[] nums=new int[5];
		nums[0]=100;
		nums[1]=200;
		nums[2]=400;
		nums[3]=600;
		nums[4]=300;
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("enhanced for loop");
		for(int temp:nums)
		{
			System.out.println(temp);
		}
		
				
		
		

	}

}
