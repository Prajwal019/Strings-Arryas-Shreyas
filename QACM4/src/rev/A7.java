package rev;

public class A7 {
int a=10;
	public static void main(String[] args) {
		new A7().test();

	}
	public void test()
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(new A7().a);
	}
}
