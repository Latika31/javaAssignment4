package Q4;

import java.util.Scanner;

public class Vehicle {
	static int mileage;
	static int price;
	
	Vehicle(){
		super();
		//System.out.println("This is Vehicle Const");
	}
	
	Vehicle(int mileage, int price) {
		this.mileage = mileage;
		this.price = price;
	}
	
	void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mileage");
		mileage=sc.nextInt();
		
		System.out.println("Enter Price");
		price=sc.nextInt();
		

	}


}