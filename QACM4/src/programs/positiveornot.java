package programs;

import java.util.Scanner;

public class positiveornot {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
int num=s.nextInt();

if(num>0) {System.out.println(num+" is a positive no");}
else
{
	System.out.println(num+" is negative no");
	}

}

}

