package Stringpractice;

public class upperCase {

	public static void main(String[] args) {
   String s="shrEyas";
   char []ch=s.toCharArray();
   String upper="";
   for(int i=0;i<ch.length;i++) {
	   if(ch[i]>='a'&&ch[i]<='z') {
		   char c=(char) (ch[i]-32);
		   upper=upper+c;
	   }
	   else
		   upper=upper+ch[i];
   }
   System.out.println(upper);
	}

}
