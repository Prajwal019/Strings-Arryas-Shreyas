package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(0);
		a.add(200);
		a.add(6);
		a.add(2);
		a.add(7);
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(0);
		a1.add(200);
		a1.add('b');
		a1.add(20.56);
		int[]c= {10,20,40,46};
		for(Object b:a)
		{
			System.out.println(b);
		}
		}
		
}

