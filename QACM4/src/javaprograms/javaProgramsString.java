package javaprograms;

public class javaProgramsString {

	public static void main(String[] args) {
		String s="mom";
		StringBuffer b=new StringBuffer(s);
		b= b.reverse();
		String j=new String(b);
		if(j.equalsIgnoreCase(s)) {
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println("not a palindrome String");
		}

	}

}
