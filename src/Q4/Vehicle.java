package Q4;

public class Vehicle {
	int mileage;
	int price;
	
	Vehicle(){
		System.out.println("This is Vehicle Const");
	}
	
	Vehicle(int mileage, int price) {
		this.mileage = mileage;
		this.price = price;
	}


public static void main(String[] args) {
	Audi a1=new Audi();
	a1.model="A";
}

}