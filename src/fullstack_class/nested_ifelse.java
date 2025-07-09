package fullstack_class;
import java.util.Scanner;
public class nested_ifelse {
	int age,sal,bns;
	Scanner sc=new Scanner(System.in);
	void get12()
	{
	System.out.print("Enter the age is ::");
	age=sc.nextInt();
		if(age>61)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your salary is ::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your sa;ary is ::"+bns)	;		
			}
		}
		else
		{
			System.out.println("Your age is law");
		}
	}
	public static void main(String[] args) {
		nested_ifelse f2=new nested_ifelse();
		f2.get12();
	}

}
