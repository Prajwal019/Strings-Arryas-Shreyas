package program.practice;

import java.util.Scanner;

//wrt a java program to find the no of days in a given month useing switch
public class NoOFDaysInMonth {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the month number");
 int month = sc.nextInt();
switch(month)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
{
	System.out.println("no of days is 31");
	break;
}
case 4:
case 6:
case 9:
case 11:
{
	System.out.println("no of days is 30");
	break;
}
case 2:
{
	System.out.println("no of days is 28/29");
	break;
}
default : System.out.println("invalid month");
	
}
}
}
