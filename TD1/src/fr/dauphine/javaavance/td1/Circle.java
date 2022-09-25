package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;
import java.math.*;

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
		return "(("+p.getX()+","+p.getY()+"),"+r+","+this.area()+")";
	}
	
	// 4 -
	public Circle translate(int dx, int dy) {
		return new Circle(this.p.translate(dx, dy), this.r);
	}
	
	public Point getCenter() {
		return this.p;
	}
	
	// 7 -
	public double area() {
		return Math.PI*this.r*this.r;
	}
	
	// 8 -
	public boolean contains(Point p1) {
		double d = Math.sqrt(Math.pow(this.p.getX()-p1.getX(),2) - Math.pow(this.p.getY()-p1.getY(),2));
		if (d <= this.r) {
			return true;
		}
		return false;
	}
}
