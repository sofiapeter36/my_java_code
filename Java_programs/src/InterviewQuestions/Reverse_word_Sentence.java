package InterviewQuestions;

public class Reverse_word_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "";
		String s = "My God is always Great";
		String[] sh = s.split(" ");
		for (String d : sh) {
			String word = "";
			for (int i = d.length() - 1; i >= 0; i--) {

				word = word + d.charAt(i);

			}
			System.out.println(word);
			rev = rev + word + " ";
		}
		System.out.println(rev);

	}

}
