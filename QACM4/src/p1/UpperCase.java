package p1;

public class UpperCase {

	public static void main(String[] args) {
     String s="shreyas";
     String uppercase="";
     char[]ch=s.toCharArray();
     for(int i=0;i<ch.length;i++) {
    	 if(ch[i]>='a'&&ch[i]<='z') {
    		 char ch1=(char) (ch[i]-32);
    		 uppercase=uppercase+ch1;
    		 
    	 }
     }
     System.out.println(uppercase);
	}

}
