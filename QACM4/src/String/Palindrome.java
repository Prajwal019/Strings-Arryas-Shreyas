package String;

public class Palindrome {

		public static void main(String[] args) {
		String s1="Malayalam".toUpperCase();
		String rev="";
		for(int i=0;i<s1.length();i++)
		{
			rev=s1.charAt(i)+rev;
		}

		if(s1.equals(rev))
		{
		System.out.println(s1+" is palindrome string");
	}
		else
		{
			System.out.println(s1+" is not palindrome string");
	}
		}
}
