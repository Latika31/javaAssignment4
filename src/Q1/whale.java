package Q1;

interface Mammals1{
	 default void display1() {
		System.out.println("I am a Mammal");
	}
}

interface MarineAnimals1{
	 default void display2() {
		System.out.println("I am a MarineAnimal");
	}
}

class BlueWhale1 implements Mammals1, MarineAnimals1{
	public void display() {
		System.out.println("I belong to both Categories: Mammals as well as MarineAnimals");
	}
	
	public static void main(String [] args) {
		BlueWhale1 b1=new BlueWhale1();
		b1.display();
		b1.display1();
		b1.display2();
		
	//	MarineAnimal m1=new MarineAnimal();	//Interface doesnt and cant create objects
		Mammals1 m1=new BlueWhale1();
		m1.display1();
		
		MarineAnimals1 ma1= new BlueWhale1();
		ma1.display2();
	
	}
}