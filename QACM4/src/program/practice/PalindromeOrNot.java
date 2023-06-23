package program.practice;
//W.j.p to find the given number is palindrome or not
public class PalindromeOrNot {

	public static void main(String[] args) {
		int num=343;
		int num1=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(num1==rev) {
			System.out.println("given number is palindrome");
		}
		else
			System.out.println("given number is not a palindrome");

	}

}
