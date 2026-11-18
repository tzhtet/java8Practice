package java8Practice.housekeeping;

public class Apple {
	
	Apple getPeeled() {
		return Peeler.peel(this);
	}

}
