package Collections;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mp=new LinkedHashMap<String,String>();
		mp.put("sofia", "James");
		mp.put("jenefer", "diwakar");
		mp.put("Jainy", "Peter");
		
		Iterator <Map.Entry<String,String>> it= mp.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
