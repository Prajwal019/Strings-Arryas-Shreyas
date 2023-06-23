package programs;

import java.util.Scanner;

public class Special2Digit {
	public static void main(String[] args) {
		System.out.println("enter the Number");
		Scanner s=new Scanner(System.in);
int num=s.nextInt();
int a=num%10;
int b=num/10;
int res=(a+b)+(a*b);
if(num==res)
		{System.out.println(num+" is a special 2 digit no");
		}
else
{
	System.out.println(num+" is a not special 2 digit no");
	}

}

}
