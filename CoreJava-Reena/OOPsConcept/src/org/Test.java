package org;

public class Test {

	public static void main(String[] args) {
		Person P1=new Person();
		P1.name="Reena";
		P1.age=23;
		P1.address="Tirupati";
		
		System.out.println(P1.name+"WITH THE AGE OF"+P1.age+"resides at"+P1.address);
		
		
		Student S1=new Student();
		S1.name="Sree";
		S1.id=345;
		System.out.println("The name of the student  is" +S1.name+"with id" +S1.id);
		
	}

}
