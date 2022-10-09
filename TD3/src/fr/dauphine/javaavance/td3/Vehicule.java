package fr.dauphine.javaavance.td3;

import fr.dauphine.javaavance.td3.Discount;

public class Vehicule {
	
	String brand;
	long value;
	String discount = null;
	
	public void isDiscount(String d) {
		if (!(d.equals(null))) {
			Discount dis = new Discount();
			this.value = dis.value;
		}
	}

}
