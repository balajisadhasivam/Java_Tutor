package practice2;

public class methods {
	String name;
    int year;
	void car(String name, int year)
	{
		System.out.println(name+" "+year);
	}
	public static void main(String[] args) {
		methods a= new methods();
	    a.car("Ford", 1870);
	    a.car("Audi", 1934);

	}

}
