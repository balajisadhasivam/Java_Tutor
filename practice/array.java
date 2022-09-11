package practice2;

public class array {
	void display(int a[])
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		array p= new array();
		p.display(a);

	}
}
