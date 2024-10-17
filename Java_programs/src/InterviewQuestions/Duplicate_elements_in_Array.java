package InterviewQuestions;

public class Duplicate_elements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ff= {"java","sql","sql","java","pearl","ruby","pearl"};
		
		for(int i=0;i<ff.length;i++)
		{
			for(int j=i+1;j<ff.length;j++) {
				if(ff[i]==ff[j]) {
					System.out.println(ff[i]);
				}
			}
		}

	}

}
