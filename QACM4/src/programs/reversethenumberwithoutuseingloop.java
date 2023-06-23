package programs;

public class reversethenumberwithoutuseingloop {

	public static void main(String[] args) {
int a=1234;
String s=String.valueOf(a);
StringBuilder q=new StringBuilder(s).reverse();
String d=new String(q);
int rev=Integer.parseInt(d);
System.out.println(rev);

	}

}
