package fullstack_class;
import java.util.Scanner;
class Demo13
{
	int empid[][]=new int [5][5];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n and m is ::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void logic()
	{
		for (i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is ::");
				empid[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your value is ::"+empid[i][j]);
			}
		}
	}
}
public class Twodimensional_arry {
	public static void main(String[] args) {
		Twodimensional_arry f1 = new Twodimensional_arry();
		f1.get();
		f1.display();
	}

}
