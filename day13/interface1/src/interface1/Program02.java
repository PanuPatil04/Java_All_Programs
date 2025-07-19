package interface1;

interface Displayable {
	default void print() {
		System.out.println("Displayable");
	}
}

interface Showable {
	default void print() {
		System.out.println("Showable");
	}
}



// This class handles default method conflict
class Test implements Displayable, Showable {
	@Override
	public void print() {
		Displayable.super.print(); // resolve ambiguity
		System.out.println("Test::display");
	}
}

// Concrete class implementing Acceptable


public class Program02 {
	public static void main(String[] args) {
		Acceptable a = new Time();
		a.accept(null);     // Passing null, will default to "12:00 PM"
		a.display();        // Show the time
		 a.print();        // Print message from Time class
	}
}
