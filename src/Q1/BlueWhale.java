package Q1;

interface Mammals{
	 default void display1() {
		System.out.println("I am a Mammal");
	}
}

interface MarineAnimals{
	 default void display2() {
		System.out.println("I am a MarineAnimal");
	}
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
}