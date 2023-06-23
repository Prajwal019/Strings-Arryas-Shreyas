package rev;

public class exceptionPropagation {
	public static void test() {
		
		System.out.println("test begain");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		System.out.println("test end");
		
	}
	

	public static void main(String[] args) {
		System.out.println("main begin");
		print();
		System.out.println("main end");
		
	}
		public static void print() {
			System.out.println("print begain");
			test();
			System.out.println("print end");

}}
