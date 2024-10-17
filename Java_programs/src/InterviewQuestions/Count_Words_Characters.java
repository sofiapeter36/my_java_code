package InterviewQuestions;

public class Count_Words_Characters {
	static String s= "God is Great";
	int countword=0,countchar=0;
	
	public String countWords(String text)
	{
		String[] word=s.split(" ");
		for(String w: word) {
			//System.out.println(w);
			countword++;
		}
		System.out.println(countword);
		return text;
		
	}
	
	public String countchar(String text1)
	{
		String cha=s.replaceAll("\\s", "");
		for(int i=0;i<cha.length();i++)
		{
			//System.out.println(cha.charAt(i));
			countchar++;
		}
		System.out.println(countchar);
		return text1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count_Words_Characters cwc =new Count_Words_Characters();
		cwc.countWords(s);
		cwc.countchar(s);
		
		
		
		
		
		

	}

}
