package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;
import java.util.ArrayList;

public class Exo3 {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		// 1 - It prints true then false, because p2 is the same object as p1, but p3 is another one with only the same values.
		
		System.out.println(Point.isSameAs(p1, p2));
		System.out.println(Point.isSameAs(p1, p3));
		
		// 3 - p3 isn't the same object as p1, so indexOf(p3) returns -1 (because it's not in the list), while 0 with p2
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		// System.out.println(p1);
	}
	
}