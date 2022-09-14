package fr.dauphine.javaavance.td1;

public class TestPoint {

	public static void main(String[] args) {
		
	}
	
	private int x;
	private int y;
	
	public void afficherPoint() {
		// 2 - We have to change Point to TestPoint to remove errors
		TestPoint p = new TestPoint();
		System.out.println(p.x + " " + p.y);
	}
	
	// 3 - We use private to prevent accessing critical data
	
	// 4 - An accessor is a method used to access a private variable
	// afficherPoint isn't an accessor, it only prints the values
}
