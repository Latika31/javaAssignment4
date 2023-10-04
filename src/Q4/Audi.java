package Q4;

public class Audi extends Car {
	String model;

	public Audi() {
		super();
	}


	Audi(int cost, int warranty, int seat, String fuel, String model) {
		super(cost, warranty, seat, fuel);
		this.model = model;
	}


	Audi(int mileage, int price, int cost, int warranty, int seat, String fuel, String model) {
		super(mileage, price, cost, warranty, seat, fuel);
		this.model = model;
	}


	void display() {
		System.out.println("This is Audi");
	}


}