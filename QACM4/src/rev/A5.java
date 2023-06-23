package rev;

public class A5 {

	public static int a=10;
	public static void main(String[] args) {
		A5 b=new A5();
		b.test();
	}
	public void test()
	{
		A3 b=new A3();
		System.out.println(b.a);
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(A3.a);
	}
}
