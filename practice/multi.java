package practice2;
class A{
	void move() {
		System.out.println("Smvec");
	}
}
class B extends A{
	void show() {
		System.out.println("Student");
	}
}
class C extends B{
	void shows() {
		System.out.println("Ethnotech");
	}
}
public class multi {
	
	public static void main(String[] args) {
		C c=new C();
		c.move();

	}

}

