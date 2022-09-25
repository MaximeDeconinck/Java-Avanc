package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;

public class Ring {

	// 1 - We shouldn't use inheritance from the Circle class because a ring is too different.
	
	Point p;
	int r1;
	int r2;
	
	// 2 - 
	public Ring(Point p, int r1, int r2) throws IllegalArgumentException {
		if (r1 < r2) {
			this.p = p;
			this.r1 = r1;
			this.r2 = r2;
		} else {
			throw new IllegalArgumentException("r1 bigger than r2");
		}
	}
}
