package Exception;

public class Typecasting {

	public static void main(String[] args) {
		A a=new B();
		B b=(B)a;
		if (a instanceof A) {
			System.out.println(b.j);
			System.out.println(b.i);
		}
		else
			System.out.println("hi");
		
	}

}
