package java8Practice.housekeeping;

public class Tree {
	
	int height;
	
	public Tree() {
		System.out.println("Planting a seeding");
		height = 0;
	}
	
	Tree(int initialHeight){
		height = initialHeight;
		System.out.println("Creating new Tree that is " + 
		height + " feet tall");
	}
	
	void info() {
		System.out.println("Tree is " + height + "feet tall");
	}
	
	void info(String s) {
		System.out.println(s + ": Tree is " + height + "feet tall");
	}

}
