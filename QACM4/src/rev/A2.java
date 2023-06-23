package rev;

public class A2 {

	public static int a=10;
	public static void main(String[] args) {
		A2 b=new A2();
		b.test();
	}
	public void test()
	{
		A2 b=new A2();
		System.out.println(b.a);
		System.out.println(this.a);
		System.out.println(a);
	}
}