package fullstack_class;
public class fibo_series {
	public static void main(String[] args) {
		int n=5,first =0,second = 1,next,c;
		for(c=0; c<n; c++)
		{
			if(c<=1)
				next=c;
			else
			{
				next=first+second;
				first=second;
				second =next;
			}
			System.out.println("Fibseries");
		}
	}

}
