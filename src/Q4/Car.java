package Q4;

import java.util.Scanner;

public class Car extends Vehicle{
	static int cost;
	static int warranty;
	static int seat;
	static String fuel;
	
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
	
	void display() {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost:");
		cost=sc.nextInt();
		
		System.out.println("Enter warranty");
		warranty=sc.nextInt();
		
		System.out.println("Enter no of seats");
		seat=sc.nextInt();
		
		System.out.println("Enter fuel Type --> Petrol/Diesel");
		fuel=sc.next();
		
		super.display();
		

	}
}

