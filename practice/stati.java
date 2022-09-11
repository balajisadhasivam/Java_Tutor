package practice2;

public class stati {
	static int i=50;
	static
	{
		System.out.println("Welcome all");
	}
	static void shows()
	{
		System.out.println("Static method");
	}
	
	void show()
	{
		System.out.println("Students");
	}
	public static void main(String[] args) {
		stati s=new stati();
		shows();
		s.show();
		System.out.print("The value of the Static varible "+i);

	}

}
