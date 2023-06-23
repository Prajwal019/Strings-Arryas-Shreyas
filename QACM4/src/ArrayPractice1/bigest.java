package ArrayPractice1;

public class bigest {

	public static void main(String[] args) {
		String s="i am handsome boy";
 String []a=s.split(" ");
 String big=a[0];
 for(String k:a) {
	 if(k.length()>big.length()) {
		 big=k;
	 }
 }
 System.out.println(big);
	}

}
