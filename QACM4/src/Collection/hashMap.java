package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(101,"dinga");
		hs.put(102, "dingi");
		hs.put(103,"penga");
		hs.put(104,"mangi");
		hs.put(105, "manga");
		hs.put(106,"pengi");
		System.out.println(hs.size());
		System.out.println(hs);
	Set s=hs.keySet();
	for(Object o:s)
	{
		int a=(int)o;
		System.out.println(a);
		
		}
	Set s1=hs.entrySet();
	for(Object o:s1)
	{
	
		System.out.println(o);
		
	
		}
	

	}

}
