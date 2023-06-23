package programs;

public class nonprimitivetoprimitivedatatype {

	public static void main(String[] args) {
		Integer a=10;
		int b=a;
		int c = a.intValue();
		System.out.println(c);
		String s="10";
		String d=String.valueOf(s);
		System.out.println(d);
	}
	}
