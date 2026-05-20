package arrayconcepts;

public class Find_Topper_Student {

	public static void main(String[] args) {
		int[] marks= {45,56,67,78,89,56};
		 int max = marks[0];
		 int rank = 0;
		 
		 for(int i=0; i<marks.length; i++)
		 {
			 if(marks[i]> max) {
				 max = marks[i];
				 rank = i;
			 }
			
		 }
		 System.out.println("Top marks ="+ max);
		 System.out.println("rank is :"+ rank);
	}

}

