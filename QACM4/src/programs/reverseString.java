package programs;

public class reverseString {

	public static void main(String[] args) {
		String s="shreyas";
		String rev="";
		char []ch=s.toCharArray();
		for(int i=ch.length-1;i>0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		

	}

}
