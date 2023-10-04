package Q4;



class TVS extends Bike{
	String make;
	
	TVS(){
		super();
	}
	TVS(int ncylinder, int ngears, String cooling, String wheeltype, int ftanksize, String make) {
		super(ncylinder, ngears, cooling, wheeltype, ftanksize);
		this.make = make;
	}
	
		
	TVS(int mileage, int price, int ncylinder, int ngears, String cooling, String wheeltype, int ftanksize,
			String make) {
		super(mileage, price, ncylinder, ngears, cooling, wheeltype, ftanksize);
		this.make = make;
	}
	void display() {
		System.out.println("TVS");
	}
	
}