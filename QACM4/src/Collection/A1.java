package Collection;
import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {
		ArrayList <Character>a=new ArrayList<>();
		a.add('1');
		a.add('4');
		a.add('1');
		a.add('3');
		a.add('1');
		a.add('3');
		Object[] c=a.toArray();
		for(Object b:c)
		{
			a.add((Character) b);
	}
		System.out.println(a);
		

	
	}

}