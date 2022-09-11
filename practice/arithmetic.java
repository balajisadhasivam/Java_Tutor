package practice2;

public class arithmetic {
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		
		   int a=20;
		   int b=5;
           arithmetic p= new arithmetic();
           p.add(a,b);
           p.sub(a,b);
           p.mul(a,b);
           p.div(a,b);
	}
}
