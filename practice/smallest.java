package practice2;

public class smallest {

	public static void main(String[] args) {
		int arr[]= {10,58,3,89,5};
		int small=1000;
		for(int i=0;i<5;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(small);

	}

}
