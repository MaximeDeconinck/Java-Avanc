package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;
import fr.dauphine.javaavance.td1.Circle;

public class Exo5 {

	public static void main(String[] args) {
		
		Point p = new Point(1,2);
		Circle c = new Circle(p,1);
		
		Circle c2 = new Circle(p,2);
		c2.translate(1,1);
		
		System.out.println(c + " " + c2);
		// 5 - If we don't save the new value of c2, the translate is useless. We need to change the code :
		
		c2 = c2.translate(1,1);
		System.out.println(c + " " + c2);
		
		// 6 - Once again, we have to create a whole new circle :
		Circle c3 = new Circle(new Point(1,2), 1);
		c3 = new Circle(c3.getCenter().translate(1,1), c3.r);
		System.out.println(c3);
	}
}
