package java8Practice.housekeeping;

public class Persons {

	private String name;
	private int age;
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Name: "+ this.name+ "Age:" + this.age);
	}
}
