package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class A2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(0);
		a.add(200);
		a.add(6);
		a.add(2);
		a.add(7);
		Collections.sort(a);
		System.out.println(a);
	}
}

