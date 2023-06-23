package String;

public class upperconverttolowerandlowerconvertoupper {

	public static void main(String[] args) {
String s="i aM sHrEyAs";
char []c=s.toCharArray();
for(int i=0;i<c.length;i++) {
	if(c[i]>='a'&&c[i]<='z') {
		c[i]=(char) (c[i]-32);
	}
	else if(c[i]>='A'&&c[i]<='Z') {
		c[i]=(char) (c[i]+32);
	}
}
String change =new String(c);
System.out.println(change);
	}

}
