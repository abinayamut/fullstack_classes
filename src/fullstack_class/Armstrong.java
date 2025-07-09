package fullstack_class;
public class Armstrong {
	public static void main(String[] args) {
		int s= 0;
		int n=153,rem;
		int temp = n;
		while(n>0)
		{
			rem = n% 10;
			s=s+rem*rem*rem;
			n=n/10;
		}
		if(temp==s)
		{
			System.out.println("This is armstrong"+s);
		}
		else
		{
			System.out.println("This is not an armstrong"+s);
		}
	}

}

//s=0  n=153
//(153>0)
//r=3
//s=0+27
//n=15
//-------->
//(15>0)
//r=5
//s=27+(5*5*5)=27+125
//152
//n=1
//---------->
//(1>0)
//r=1
//s=152+1
//s=153         = temp