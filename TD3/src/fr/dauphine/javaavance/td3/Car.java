package fr.dauphine.javaavance.td3;

public class Car {
	
	// 1 -
	final String brand;
	final long value;
	
	// 2 -
	public Car(String brand, long value) throws IllegalArgumentException {
		// 3 -
		if (value < 0) {
			throw new IllegalArgumentException("Negative value");
		} else {
			this.brand = brand;
			this.value = value;
		}
	}
}
