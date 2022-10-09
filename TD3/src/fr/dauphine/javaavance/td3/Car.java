package fr.dauphine.javaavance.td3;

import java.util.Objects;

public class Car extends Vehicule {
	
	// 1 -
	int vetuste;
	
	// 2 -
	public Car(String brand, long value) throws IllegalArgumentException {
		// 3 -
		if (value < 0) {
			throw new IllegalArgumentException("Negative value");
		}
		this.brand = brand;
		this.value = value;
		this.vetuste = 0;
	}
	
	// 11 -
	public Car(String brand, long value, int vetuste) throws IllegalArgumentException {
		if (value < 0) {
			throw new IllegalArgumentException("Negative value");
		}
		this.brand = brand;
		this.vetuste = vetuste;
		this.value = value - 1000*vetuste;
	}
	
	public void newVetuste(int vet) {
		int d = vet - this.vetuste;
		this.value = this.value - 1000*d;
	}
	
	// 4 -
	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}
	
	// 5 -
	@Override
	public String toString() {
		return "(" + brand + ", " + value + ")";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, value, vetuste);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && value == other.value && vetuste == other.vetuste;
	}
	
	
}
