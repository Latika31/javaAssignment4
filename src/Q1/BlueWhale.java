package Q1;

interface Mammals{
	 void display1();
}

interface MarineAnimals{
	void display2();
}

class BlueWhale implements Mammals, MarineAnimals{
	public void display() {
		System.out.println("I belong to both Categories: Mammals as well as MarineAnimals");
	}
	
	public static void main(String [] args) {
		BlueWhale b1=new BlueWhale();
		b1.display();
		b1.display1();
		b1.display2();
		
	//	MarineAnimal m1=new MarineAnimal();	//Interface doesnt and cant create objects
		Mammals m1=new BlueWhale();
		m1.display1();
		
		MarineAnimals ma1= new BlueWhale();
		ma1.display2();
	
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("This is Mammals");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("This is MarineAnimals");
		
	}


}