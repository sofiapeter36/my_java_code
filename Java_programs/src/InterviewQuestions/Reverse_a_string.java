package InterviewQuestions;

public class Reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Difficult";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
			
		}
		System.out.println(rev);
			
	}

}
