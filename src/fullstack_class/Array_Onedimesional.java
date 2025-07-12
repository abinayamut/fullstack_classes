package fullstack_class;
import java.util.Scanner;

public class Array_Onedimesional {
	int empid[] = new int[5];
	int i,n;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value ::");
		n = sc.nextInt();
	
	for(i=0;i<n;i++)
	{
		System.out.println("Enter the array Value is" +(i+1)+":");
		empid[i] = sc.nextInt();
	}
	}
	void logic()
	{
		System.out.println("Your values are ");
	for(i=0;i<n;i++)
	{
		System.out.println("Your value is ::"+empid[i]);
	}
	}
	public static void main (String[] args) {
		Array_Onedimesional f1 = new Array_Onedimesional();
		f1.input();
		f1.logic();
	}
}

