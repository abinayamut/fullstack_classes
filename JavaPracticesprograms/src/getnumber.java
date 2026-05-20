import java.io.*;
public class getnumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number:");
		 int n = Integer.parseInt(br.readLine());
		 System.out.println("Square : "+(n*n));
		 br.close();

	}

}
