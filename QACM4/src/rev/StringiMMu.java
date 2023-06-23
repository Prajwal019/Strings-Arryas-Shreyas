package rev;

public class StringiMMu {

	public static void main(String[] args) {
		String s="Shreyas";
		String s1=s;
		s=s+"N.S";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);
		StringBuilder ss=new StringBuilder("Shreyas");
		StringBuilder ss1=ss;
		ss.append("N.S");
		System.out.println(ss);
		System.out.println(ss1);
	 System.out.println(ss==ss1);
	}

}
