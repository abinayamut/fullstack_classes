package fullstack_class;
public class logics_reverse_the_num {
	public static void main(String[] args) {
		int reverse = 0;
		int n=123;                                                         //if r=0 and n= 123(123!=0)
		while(n!=0)                                                        //r=0 123%10=12,3
		{                                                                  //r=3
			reverse = reverse*10;                                          //n=12   (12!0) 12%10=1,2
			reverse = reverse+n%10;                                        //r=2
			n=n/10;                                                        //n=1    (1!0)  1%10=some thing under 0
		}
		System.out.println("Reverse Number is :: "+reverse);
	}

}
