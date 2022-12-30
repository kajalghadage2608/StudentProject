package com.java8features;

public class Car {

	private String carName;

	private String carColour;

	private long price;

	public Car(String carName, String carColour, long price) {
		super();
		this.carName = carName;
		this.carColour = carColour;
		this.price = price;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColour=" + carColour + ", price=" + price + "]";
	}

}
