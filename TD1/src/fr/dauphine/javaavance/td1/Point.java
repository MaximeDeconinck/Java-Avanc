package fr.dauphine.javaavance.td1;

public class Point {
	
	private int x;
	private int y;
	
	public void afficherPoint() {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
	}
	
	// It works because we create first a Point object and then we print the coordinates.
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		// We need to rename x to px and y to py the variables on the right side
		// If we come back to only x and y, we have to change back
	}
	
	// To keep a tracker, we can use a global value in our class and increase it each time our constructor is called
}
