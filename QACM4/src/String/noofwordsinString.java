package String;

public class noofwordsinString {

	public static void main(String[] args) {
String s= "i am   shreyas";
char[]ch=s.toCharArray();
int words=0;
for(int i=0;i<ch.length;i++) {
	if(ch[i]!=' '&&i==0||ch[i]!=' '&&ch[i-1]==' ') {
	
		ch[i]=(char) (ch[i]-32);
	}
}
String s1=new String(ch);
System.out.println(s1);
	}

}
