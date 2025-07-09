package fullstack_class;
import java.util.Scanner;
public class Inputconcepts {
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and empname");
		empid=sc.nextInt();
		empname=sc.next();
	}
	void display()
	{
		System.out.println("your value is ::" +empid+ "empname");
	}
	public static void main(String[] args) {
		Inputconcepts f1=new Inputconcepts();
		f1.input();
		f1.display();

	}

}
