package java8Practice.housekeeping;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		engine = new Engine(this);
	}

}
