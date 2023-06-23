package p1;

public class LowerCase {

	public static void main(String[] args) {
    String s="SHREYAS";
    String lowercase="";
    char[]ch=s.toCharArray();
    for(int i=0;i<ch.length;i++) {
    	if(ch[i]>='A'&&ch[i]<='Z') {
    	char ch1=(char) (ch[i]+32);
    	lowercase=lowercase+ch1;
    	}
    }
    System.out.println(lowercase);
	}

}
