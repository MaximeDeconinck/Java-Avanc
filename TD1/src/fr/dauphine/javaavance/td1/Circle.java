package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;

public class Circle {

	// 2 -
	Point p;
	int r;
	
	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}
	
	// 3 -
	@Override
	public String toString() {
		return "(("+p.getX()+","+p.getY()+"),"+r+")";
	}
	
	// 4 -
	public Circle translate(int dx, int dy) {
		return new Circle(this.p.translate(dx, dy), this.r);
	}
}
