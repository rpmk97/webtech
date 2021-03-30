package com.example.exercise._2;

public class Car implements Comparable<Car> {

	int vin;
	String model;
	String make;
	double price;
	int speed;
	String color;

	public Car() {
	}

	public Car(String model, String make, double price, int speed, String color) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public Car(int vin, String model, String make, double price, int speed, String color) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + speed;
		result = prime * result + vin;
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (speed != other.speed)
			return false;
		if (vin != other.vin)
			return false;
		return true;
	}
	
	public int compareTo(Car other) {
		if(this.vin == other.vin) {
			return 0;
		}
		if(this.vin < other.vin) {
			return -1;
		}
		return 1;
	}

	public String toString() {
		return "Car [vin=" + vin + ", model=" + model + ", make=" + make + ", price=" + price + ", speed=" + speed
				+ ", color=" + color + "]";
	}
	
}
