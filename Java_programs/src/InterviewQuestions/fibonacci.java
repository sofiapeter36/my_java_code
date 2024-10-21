package InterviewQuestions;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float s1=0,s2=1,temp=0;
		for(int i=2;i<10;i++) {
			temp=s1+s2;
			s1=s2;
			s2=temp;
			
		
		}
		System.out.println(temp);
		
		
		

	}

}
