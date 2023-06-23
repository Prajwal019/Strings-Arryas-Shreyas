package Collection;

import java.util.ArrayList;

public class C2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
				al.add(12);
				al.add(72);
				al.add(56);
				al.add(27);
				al.add(76);
				al.add(78);
				System.out.println(al);
				ArrayList al1=new ArrayList();
				al1.add(28);
				al1.add(76);
				al1.add(59);
				al1.add(74);
				al1.add(74);
				al1.add(77);
				System.out.println(al1);
				al.addAll(al1);
				System.out.println(al);
				System.out.println(al1);
				System.out.println(al.contains(76));
				System.out.println(al.contains(70));
				System.out.println(al.contains(77));
				System.out.println(al.contains(76));
				System.out.println(al.retainAll(al1));
			}
}
