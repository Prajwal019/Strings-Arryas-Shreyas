package programs;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
int num=s.nextInt();
int num1 = num;
int rev=0;
while(num>0)
{int rem=num%10;
rev=rev*10+rem;
	num=num/10;
	
}if(num1==rev) {System.out.println(num1+" is not a palindrome");}
else
{
	System.out.println(num1+" is not a palindrome no");
	}

}

}
