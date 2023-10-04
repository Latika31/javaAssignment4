package Q4;


 public class Bajaj extends Bike{
	String make;
	
	Bajaj(){
		super();
	}

	Bajaj(int ncylinder, int ngears, String cooling, String wheeltype, int ftanksize, String make) {
		super(ncylinder, ngears, cooling, wheeltype, ftanksize);
		this.make = make;
	}
	
	void display() {
		System.out.println("Bajaj Bike");
	}
	
}
