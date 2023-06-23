package ArrayPractice1;

import java.util.ArrayList;

public class missingnoinArray {

	public static void main(String[] args) {
int[] a= {1,7,4,3};
ArrayList ls=new ArrayList();
int i=1;
while(i<=10) {
	ls.add(i);
	i++;
}
ArrayList l=new ArrayList();
for(int b=0;b<a.length;b++) {
	l.add(a[b]);
}
ls.removeAll(l);
System.out.println(ls);
	}

}
