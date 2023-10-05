package Q4;

import java.util.Scanner;

public class Audi extends Car {
	static String model;

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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of model");
		model = sc.next();
		
		super.display();
		
		System.out.println("This is Audi");
		
		//display of vehicle
		System.out.println("Mileage: "+mileage);
		System.out.println("Price: "+price);
		
		//display of car
		System.out.println("Cost: "+cost);
		System.out.println("Warranty: "+warranty);
		System.out.println("Seat: "+seat);
		System.out.println("Fuel: "+fuel);
		
		//display of audi
		System.out.println("Model: "+model);
		
	}

}