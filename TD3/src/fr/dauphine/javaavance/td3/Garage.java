package fr.dauphine.javaavance.td3;
import fr.dauphine.javaavance.td3.Vehicule;
import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	
	// 6 -
	ArrayList<Vehicule> garage;
	int taille;
	int id = 0;
	static int count = 0;
	
	public Garage(int taille) {
		this.taille = taille;
		this.garage = new ArrayList<>(taille);
		// 7 -
		this.id = count++;
	}
	
	public void add(Vehicule vehicule) {
		Objects.requireNonNull(vehicule, "car must not be null");
		this.garage.add(vehicule);
	}
	
	public int getId() {
		return this.id;
	}
	
	// 8 -
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Vehicule vehicule : this.garage) {
			builder.append(vehicule);
		}
		return builder.toString();
	}
	
	// 9 -
	public int getGarageValue() {
		int total = 0;
		for (Vehicule vehicule : this.garage) {
			total = (int) (total + vehicule.value);
		}
		return total;
	}
	
	// 10 -
	public Car firstCarByBrand(Car car) throws Error {
		for (Vehicule carInGarage : this.garage) {
			if (carInGarage.brand.equals(car.brand)) {
				return (Car) carInGarage;
			}
		}
		throw new Error("No car with this brand in garage");
	}
	
	// Exo2 - 4 - 
	public void remove(Car c) throws IllegalArgumentException {
		if (this.garage.indexOf(c) == -1) {
			throw new IllegalArgumentException("Car not in garage");
		}
		this.garage.remove(this.garage.indexOf(c));
	}
}
