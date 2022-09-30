package fr.dauphine.javaavance.td3;
import fr.dauphine.javaavance.td3.Car;
import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	
	// 6 -
	ArrayList<Car> garage;
	int taille;
	int id = 0;
	static int count = 0;
	
	public Garage(int taille) {
		this.taille = taille;
		this.garage = new ArrayList<>(taille);
		// 7 -
		this.id = count++;
	}
	
	public void add(Car car) {
		Objects.requireNonNull(car, "car must not be null");
		this.garage.add(car);
	}
	
	public int getId() {
		return this.id;
	}
	
	// 8 -
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Car car : this.garage) {
			builder.append(car);
		}
		return builder.toString();
	}
	
	// 9 -
	private int getGarageValue() {
		int total = 0;
		for (Car car : this.garage) {
			total = (int) (total + car.value);
		}
		return total;
	}
}
