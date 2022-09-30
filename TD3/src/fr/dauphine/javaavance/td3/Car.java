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
		}
		this.brand = brand;
		this.value = value;
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
}
