package String;

public class immutable {

	public static void main(String[] args) {
String s1="hi";
String s2="hello";
s1.concat(s2);
System.out.println(s1);
System.out.println(s2);
StringBuilder a=new StringBuilder("hi");
StringBuilder b=new StringBuilder("hello");
a.append(b);
System.out.println(a);
System.out.println(b);

	}

}
