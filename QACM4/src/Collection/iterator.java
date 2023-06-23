package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {

	public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add(14);
	ls.add(18);
	ls.add(65);
	ls.add(23);
	System.out.println(ls);
	ListIterator i = ls.listIterator();
	int count=0;
	int key=18;
	while(i.hasNext())
	{
if(ls.contains(key)) {
count++;
	break;

}}
if(count==1)
{System.out.println(key+" is present");}
}
	}

	


