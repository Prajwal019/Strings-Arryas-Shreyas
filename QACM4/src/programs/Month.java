package programs;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		System.out.println("enter the month no");
		Scanner s=new Scanner(System.in);
		int mon=s.nextInt();
		switch(mon)
		{
		case 1:
		case 3:
		case 5:
		case 8:
		case 10:
		case 12: 
		case 7:
		{System.out.println("no of days is 31");
	break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{System.out.println("no of days is 30");
		break;
		}
		case 2:
		{System.out.println("no of days is 28");
		break;
		}
		default:
		{System.out.println("invalid month");
		
		}
		}}}
