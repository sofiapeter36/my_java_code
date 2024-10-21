package InterviewQuestions;

public class Ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s= {8,4,5,6,2,1};
		
	int temp =0;
	for (int i=0;i<s.length;i++) {
		for(int j=i+1;j<s.length;j++)
		{
			if(s[j] > s[i]) {
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
			
		}
		System.out.print(s[i]+",");
	}
	//for(int i=0;i<s.length;i++) {
	
	}
	

	}


