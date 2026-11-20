package java8Practice.housekeeping;

public class Event {
	
	public void registerListener(Listener listener) {
		listener.onEvent(this);
	}

}
