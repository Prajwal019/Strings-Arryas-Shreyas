package Stringpractice;

public class LowerCase {

	public static void main(String[] args) {
		 String s="SHREYAS";
		   char []ch=s.toCharArray();
		   String LOWER="";
		   for(int i=0;i<ch.length;i++) {
			   if(ch[i]>='A'&&ch[i]<='Z') {
				   char c=(char) (ch[i]+32);
				   LOWER=LOWER+c;
			   }
			   else
				   LOWER=LOWER+ch[i];
		   }
		   System.out.println(LOWER);
			}
	}


