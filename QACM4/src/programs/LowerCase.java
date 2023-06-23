package programs;

public class LowerCase {

	public static void main(String[] args) {
		String s="SHREYAS";
		String s1="";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				char c=(char) (ch[i]+32);
				s1=s1+c;
				
			}
		}
		System.out.println(s1);
	}

}
