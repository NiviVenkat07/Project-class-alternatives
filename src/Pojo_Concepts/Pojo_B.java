package Pojo_Concepts;

public class Pojo_B {

	public static void main(String[] args) {

		Pojo_A a = new Pojo_A();
		
		int age =a.getAge();
		
		System.out.println("age :" + age);
		
		a.setAge(100);
		
	System.out.println("after set");
		
		int Age =a.getAge();
	
		System.out.println(Age);
		
	}
	
	
	
	
}
