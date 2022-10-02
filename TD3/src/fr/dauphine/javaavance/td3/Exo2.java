package fr.dauphine.javaavance.td3;
import fr.dauphine.javaavance.td3.Car;
import fr.dauphine.javaavance.td3.Garage;
import java.util.ArrayList;
import java.util.HashSet;

public class Exo2 {
	
	public static void main(String[] args) {
		
		// 1 - Le comportement n'est pas naturel, car on devrait avoir true pour b.equals(c).
		Car a = new Car("Audi", 10000);
		Car b = new Car("BMW", 9000);
		Car c = new Car("BMW", 9000);
		Car d = a;
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		
		// 2 - Pour corriger le problème, on Override la méthode equals utilisée normalement par indexOf
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		
		// 3 - We create a brand new implementation of HashCode and equals to have true here (it doesn't break what we code before)
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
	}
}
