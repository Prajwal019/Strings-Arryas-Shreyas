package programs;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		System.out.println("enter the Year");
		Scanner s=new Scanner(System.in);
int Year=s.nextInt();

if((Year%4==0&&Year%100!=0)||Year%400==0) {System.out.println(Year+" is a leap Year");}
else
{
	System.out.println(Year+" is not a leap Year");
	}

}

}
