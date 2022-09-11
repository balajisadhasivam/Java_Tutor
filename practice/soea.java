package practice2;

public class soea {
	void display(int arr[])
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.print(sum);
    }
	public static void main(String[] args) {
		int arr[]={85,74,21,6,5};
        soea p= new soea();
        p.display(arr);

	}

}
