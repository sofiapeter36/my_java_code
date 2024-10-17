package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Count_and_print_Vowels {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String rev = "";
		String s = "ashoka chakra has twenty four stokes";
		String sh = s.replaceAll("\\s", "");
		System.out.println(sh);
		for (int i = 0; i < sh.length(); i++) {
			if (sh.charAt(i) == 'a' || sh.charAt(i) == 'e' || sh.charAt(i) == 'i' || sh.charAt(i) == 'o'
					|| sh.charAt(i) == 'u') {
				count++;
				// printVowelscharacters
				rev = rev + sh.charAt(i);
			}

		}
		System.out.println(count);
		System.out.println(rev);

	}

}
