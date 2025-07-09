package fullstack_class;
import java.util.Scanner;
public class demo {
	int a,b;
	Scanner sc=new Scanner(System.in);
	void input()
	{
			System.out.println("Enter the a and b value is::");
			a=sc.nextInt();
			b=sc.nextInt();
	}
	void ifelse()
	{
		if(a==b)
		{
			System.out.println("It's is equal");
		}
		else
		{
			System.out.println("It's is not equal");
		}
	}
	public class controlstatement {
		public static void main(String[] args) {
			demo f1=new demo();
			f1.input();
			f1.ifelse();
		}
	}
}
