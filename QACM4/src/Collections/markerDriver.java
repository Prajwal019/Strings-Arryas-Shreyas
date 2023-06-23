package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class markerDriver {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new marker(012,"blue",55.20));
		ls.add(new marker(017,"black",87.97));
		ls.add(new marker(015,"red",58.26));
		ls.add(new marker(014,"green",75.29));
		ls.add(new marker(016,"yellow",78.90));
		Collections.sort(ls);
		System.out.println(ls);
		
	}

}
