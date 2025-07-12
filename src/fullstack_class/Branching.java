package fullstack_class;
import java.util.Scanner;

public class Branching {
int a,b,n;
Scanner sc = new Scanner(System.in);
void input()
{
	//System.out.println("Enter the a and b values is ::");
	//a=sc.nextInt();
	//b=sc.nextInt();
	//System.out.println("Enter the n value :");
	//n=sc.nextInt();
}
void ifelse()
{
	if(a==b)
	{
		System.out.println("it is equal");
	}
	else
	{
		System.out.println("It is not equal");
	}
}

void evenotodd()
{
	if (n%2 == 0)
	{
		System.out.println("It is even");
	}
	else
	{
		System.out.println("It is odd");
	}
}
	public static void main(String[] args) {
		Branching u1= new Branching();
		u1.input();
		u1.ifelse();
		u1.evenotodd();
		
		
	}

}
