package Q4;

class Ford extends Car {
	String model;

	
	Ford(){
		super();
	}

	public Ford(int cost, int warranty, int seat, String fuel) {
		super(cost, warranty, seat, fuel);
		this.model=model;
	}

	public Ford(int mileage, int price, int cost, int warranty, int seat, String fuel, String model) {
		super(mileage, price, cost, warranty, seat, fuel);
		this.model=model;
	}
	
	void display() {
		//display of vehicle
		System.out.println("This is Ford");
		System.out.println("Mileage: "+mileage);
		System.out.println("Price: "+price);
		
		//display of car
		System.out.println("Cost: "+cost);
		System.out.println("Warranty: "+warranty);
		System.out.println("Seat: "+seat);
		System.out.println("Fuel: "+fuel);
		
		//display of Ford
		System.out.println("Model: "+model);
	}
	
	public static void main(String [] args) {
		Ford f1=new Ford(12,1234567,34678,2,4,"Petrol", "Q");
		f1.display();
	}
}
