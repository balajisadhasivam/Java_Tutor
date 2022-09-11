package practice2;

import java.util.Scanner;

public class clac {
	
	public static void main(String[] args) {
		System.out.println("1.add\n2.sub\n3.mul\n4.div");
		Scanner s= new Scanner(System.in);
		int a=20,b=5;
		System.out.println("Enter the operation to perform");
		char ch= s.nextLine().charAt(0);
		switch(ch)
		{
		case '+': System.out.print("The addition is "+(a+b));
		          break;
		case '-': System.out.print("The Substraction is "+(a-b));
		          break;
		case '*': System.out.print("The is multiplication is "+(a*b));
		          break;
		case '/': System.out.print("The division is "+(a/b));
		          break;
		default: System.out.print("Enter the valid input");          
		}

	}

}
