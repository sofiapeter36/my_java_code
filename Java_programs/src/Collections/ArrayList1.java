package Collections;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls= new ArrayList<String>();
		ls.add("aa");
		ls.add("bb");
		ls.add("cc");
		ls.add("dd");
		
		Iterator<String> it= ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("~~~~~~~~~~~~~~");
		List<Integer> os=new LinkedList<Integer>();
		os.add(123);
		os.add(234);
		os.add(456);
		
		Iterator<Integer> it1=os.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
			
		}
		
	}

}
