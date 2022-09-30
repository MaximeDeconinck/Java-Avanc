package fr.dauphine.javaavance.td3;

public class Car {
	
	// 1 -
	final String brand;
	long value;
	int vetuste;
	
	// 2 -
	public Car(String brand, long value) throws IllegalArgumentException {
		// 3 -
		if (value < 0) {
			throw new IllegalArgumentException("Negative value");
		}
		this.brand = brand;
		this.value = value;
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
}
