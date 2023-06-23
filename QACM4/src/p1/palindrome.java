package p1;

public class palindrome {

	public static void main(String[] args) {
String s="wow";
String rev="";
char[]ch=s.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
	rev=rev+ch[i];
}
if(rev.equals(s)) {
	System.out.println("Given String is palindrome");
}
else
{
	System.out.println("Given String is not palindrome");
}
	}

}
