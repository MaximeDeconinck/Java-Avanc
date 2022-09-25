package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;
import fr.dauphine.javaavance.td1.PolyLine;

public class Exo4 {
	
	public static void main(String[] args) {
		
		PolyLine pl = new PolyLine(5);
		Point p = new Point(1,2);
		
		pl.add(p);
		System.out.println(pl.list);
		
		// 5 - We have a NullPointerException with contains(null), idem with a add(null) before the call
		pl.add(null);
		System.out.println(pl.contains(null));
	}
}
