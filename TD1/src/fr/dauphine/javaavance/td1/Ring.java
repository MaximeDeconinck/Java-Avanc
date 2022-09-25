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
	
	// 3 -
	public boolean equals(Ring ring) {
		if (this.p.equals(ring.p)) {
			if (this.r1 == ring.r1) {
				if (this.r2 == ring.r2) {
					return true;
				}
			}
		}
		return false;
	}
	
	// 4 -
	@Override
	public String toString() {
		return "(("+p.getX()+","+p.getY()+"),"+r1+","+r2+")";
	}
	
	// 5 -
	public boolean contains(Point p1) {
		double d = Math.sqrt(Math.pow(this.p.getX()-p1.getX(),2) - Math.pow(this.p.getY()-p1.getY(),2));
		if (this.r1 < d) {
			if (this.r2 > d) {
				return true;
			}
		}
		return false;
	}
}
