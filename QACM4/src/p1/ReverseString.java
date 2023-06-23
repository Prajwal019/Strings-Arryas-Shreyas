package p1;

public class ReverseString {

	public static void main(String[] args) {
String s="hello";
String rev="";
char[]ch=s.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
	rev=rev+ch[i];
}
System.out.println(rev);
	}

}
