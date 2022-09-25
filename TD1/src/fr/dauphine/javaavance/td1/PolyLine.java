package fr.dauphine.javaavance.td1;
import fr.dauphine.javaavance.td1.*;
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
	public void addPoint(Point p) {
		if (!(this.list.size() == this.taille)) {
			this.list.add(p);
		}
	}
}
