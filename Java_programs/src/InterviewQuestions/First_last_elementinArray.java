package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class First_last_elementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ch= {"sofia","James","vivin","Niralya","Julia"};
		
		List<String> ls=Arrays.asList(ch);
		ls.get(0);
		System.out.println("First element in Array " +ls.get(0));
		ls.get(ls.size()-1);
		System.out.println("Last element in Array " +ls.get(ls.size()-1));
		System.out.println("Middle element in Array " +ls.get(ls.size()/2));
		
	}

}
