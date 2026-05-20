import java.io.*;

public class readnamedubr {

	public static void main(String[] args)throws  IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String 	name = br.readLine();
		System.out.println("Hello " + name);
		br.close();
	}
}
