package practice2;

public class swap {
	public void swap(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The elements after swapping is "+a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		swap p=new swap();
		int arr[]= {1,2,3,4,5};
		int a=arr[0],b=arr[3];
		System.out.println("The elements before swapping is "+a);
		System.out.println(b);
		p.swap(a,b);
	}

}
