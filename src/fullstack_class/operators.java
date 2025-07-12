package fullstack_class;
import java.util.Scanner;
public class operators {
	int a,b;
	Scanner sc=new Scanner(System.in);
	void arithmaticOperator()
	{
		System.out.println("Enter the value of a and b is ::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Add::"+(a+b));
		System.out.println("Sub::"+(a-b));
		System.out.println("Mult::"+(a*b));
		System.out.println("Div::"+(a/b));
		System.out.println("module::"+(a%b));
	}
	void ComparsionOperation()
	{
		System.out.println("Enter the a and b values is::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Lessthan::"+(a<b));
		System.out.println("Greaterthan::"+(a>b));
		System.out.println("equal::"+(a==b));
		System.out.println("NotEqual::"+(a!=b));
	}
	void logicalOperator()
	{
		System.out.println("Enter the value a and b is::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Logical AND::"+((a<b)&&(b<a)));
		System.out.println("logical OR::"+((a>b)||(b>a)));
		System.out.println("logical NOT::"+(!(a>b)));
	}
	void bitwiseOperator()
	{
		System.out.println("Enter the a and b values is::");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Bitwise AND::"+(a&b));
		System.out.println("Bitwise OR::"+(a|b));
		System.out.println("Bitwise XOR::"+(a^b));
		System.out.println("Leftshift::"+(a<<1));
		System.out.println("Rightshift::"+(a>>1));	
	}
	public static void main(String[] args) {
		operators f1=new operators ();
		f1.arithmaticOperator();
		//f1.ComparsionOperation();
		//f1.logicalOperator();
		//f1.bitwiseOperator();
	}

}
