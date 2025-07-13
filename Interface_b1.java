package fullstack_class;
interface BI1
{
	int a =100;
	void get4();
}interface BI12 extends BI1
{
	void get5();
}
class DI implements BI12
{
public void get4()
	{
		System.out.println("Interface vlue is ::"+a);
	}

public void get5()
{
	System.out.println("Get 5 functions");
}
}
public class Interface_b1 {

	public static void main(String[] args) {
		DI f1 = new DI();
		f1.get4();
		f1.get5();
	}

}
