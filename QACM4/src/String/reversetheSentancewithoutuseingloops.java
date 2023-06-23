package String;

public class reversetheSentancewithoutuseingloops {

	public static void main(String[] args) {
		String s="all the best";
        String[]ch=s.split(" ");
        int l=ch.length;
       String rev = toReverse(ch,l);
       System.out.println(rev);
       
	}

	private static String toReverse(String[] ch,int l) {
		String rev="";
		if(l<=0) {
			return rev;}
		return (rev=rev+((ch[--l]+" ")))+toReverse(ch, l);
	
		
	}

}
