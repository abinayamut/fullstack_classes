package fullstack_class;
import java.io.IOException;
public class datainputstream {
	int empid;
	String empname;
	datainputstream dis=new datainputstream();
	void get() throws IOException
	{
		System.out.println("Enter the empid and empname");
		empid =Integer.parseInt(dis.readline());
		empname=dis.readline();
	}
	private String readline() {
		// TODO Auto-generated method stub
		return null;
	}
	void displaya()
	{
		System.out.println("Your value is:"+empid+" "+empname);
	}
	public static void main(String[] args) throws IOException {
		datainputstream f1= new datainputstream();
		f1.get();
		f1.displaya();
	}

}
