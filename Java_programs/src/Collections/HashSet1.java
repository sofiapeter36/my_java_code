package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Set<String> ls= new HashSet<String>();
				ls.add("aa");
				ls.add("bb");
				ls.add("cc");
				ls.add("dd");
				ls.add("aa");
				
				Iterator it= ls.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
				

			}

		

}

