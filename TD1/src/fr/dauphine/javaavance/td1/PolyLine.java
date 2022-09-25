package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.Point;
import java.util.ArrayList;

public class PolyLine {
	
	// 1 -
	int taille;
	ArrayList<Point> list;
	
	public PolyLine(int taille) {
		this.taille = taille;
		this.list = new ArrayList<>(taille);
	}
	
	// 2 - Because we can add as many points as we want in a array list, we add a condition before the insertion
	public void add(Point p) {
		if (!(this.list.size() == this.taille)) {
			this.list.add(p);
		}
	}
	
	// 3 - 
	public int pointCapacity() {
		return this.taille;
	}
	
	public int nbPoints() {
		return this.list.size();
	}
	
	// 4 -
	public boolean contains(Point p1) {
		for (Point p2 : this.list) {
			if (Point.isSameAs(p1, p2) == true) {
				return true;
			}
		}
		return false;
	}
}
