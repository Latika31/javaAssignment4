package Q5;

public class Shape {
	void display() {
		System.out.println("This is a Shape");
	}
	public static void main(String[] args) {
		Square s1=new Square();
		s1.display();
		
		System.out.println("-------------------------");
		
		Polygon p=new Polygon();
		p.display();
		
		System.out.println("-------------------------");
		
		Rectangle r=new Rectangle();
		r.display();
		
		System.out.println("-------------------------");
		
		Triangle t=new Triangle();
		t.display();
		
		System.out.println("-------------------------");
		
		Shape sh=new Shape();
		sh.display();
	}
}
