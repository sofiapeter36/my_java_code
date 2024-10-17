package InterviewQuestions;

public class Palindrome_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "MADAM";
		String word ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			word= word + s.charAt(i);
		}
		System.out.println(word);
		if(s.equalsIgnoreCase(word)) {
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
