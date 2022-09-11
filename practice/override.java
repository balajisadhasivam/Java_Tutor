package practice2;
class asa{
	void run() {
		System.out.println("Balaji");
	}
}
class bsb extends asa{
	void show() {
		System.out.println("lalith");
	}
	void display() {
		System.out.println("Parkkavan");
	}
}
public class override {
	
	public static void main(String[] args) {
		bsb s=new bsb();
		s.run();
		s.show();
		s.display();
		
		
	}
}
