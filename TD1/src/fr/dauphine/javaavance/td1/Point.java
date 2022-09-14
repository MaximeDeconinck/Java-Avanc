package fr.dauphine.javaavance.td1;

public class Point {
	
	private int x;
	private int y;
	
	/*
	public void afficherPoint() {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
	}
	*/
	
	// 1 - It works because we create first a Point object and then we print the coordinates.
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		// 5 - We need to rename x to px and y to py the variables on the right side
		// 6 - If we come back to only x and y, we have to change back
	}
	
	// 7 - To keep a tracker, we can use a global value in our class and increase it each time our constructor is called
	
	// 8 - The constructor is chosen regarding the argument used when called.
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;
	}
	
	// 9 -
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// 2 -
	public static boolean isSameAs(Point p1, Point p2) {
		return p1.getX() == p2.getX() && p1.getY() == p2.getY();
	}
	
	@Override
	public String toString() {
		return "("+getX()+";"+getY()+")";
	}
	
	// 3 -
	@Override
	public boolean equals(Object o) {		
		
        if (o == this) {
            return true;
        }

        if (!(o != null)) {
            return false;
        }
        
        Point p = (Point) o;
        return isSameAs(this,p);
    }
	
}
