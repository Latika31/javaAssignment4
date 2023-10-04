package Q4;

public class Car extends Vehicle{
	int cost;
	int warranty;
	int seat;
	String fuel;
	
	Car(){
		super();
	}
	
	Car(int cost, int warranty, int seat, String fuel) {
		super();
		this.cost = cost;
		this.warranty = warranty;
		this.seat = seat;
		this.fuel = fuel;
	}

	Car(int mileage, int price, int cost, int warranty, int seat, String fuel) {
		super(mileage, price);
		this.cost = cost;
		this.warranty = warranty;
		this.seat = seat;
		this.fuel = fuel;
	}
	
	
	
}

