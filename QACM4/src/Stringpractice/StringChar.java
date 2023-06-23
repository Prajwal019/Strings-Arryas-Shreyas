package Stringpractice;

public class StringChar {

	public static void main(String[] args) {
		//string is a immutable
		String a="hello";
		String b="shreyas";
		a.concat(b);
		System.out.println(a);
		System.out.println(b);
		//stringBuilder is mutable
 StringBuilder s=new StringBuilder("hello");
 StringBuilder s1=new StringBuilder("shreyas");
 s.append(s1);
 System.out.println(s);
 System.out.println(s1);
	}

}
