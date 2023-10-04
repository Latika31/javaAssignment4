package Q4;

public class Bike extends Vehicle{
	
	int ncylinder;
	int ngears;
	String cooling;
	String wheeltype;
	int ftanksize;
	
	Bike(){
		super();
	}
	public Bike(int ncylinder, int ngears, String cooling, String wheeltype, int ftanksize) {
		super();
		this.ncylinder = ncylinder;
		this.ngears = ngears;
		this.cooling = cooling;
		this.wheeltype = wheeltype;
		this.ftanksize = ftanksize;
	}

	Bike(int mileage, int price, int ncylinder, int ngears, String cooling, String wheeltype, int ftanksize) {
		super(mileage, price);
		this.ncylinder = ncylinder;
		this.ngears = ngears;
		this.cooling = cooling;
		this.wheeltype = wheeltype;
		this.ftanksize = ftanksize;
	}	
}


