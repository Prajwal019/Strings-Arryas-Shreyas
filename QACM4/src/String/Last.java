package String;

import java.util.Scanner;

public class Last {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your fav colour");
		String s1=s.nextLine();
		String s2="";
		for(int i=s1.length()-2;i<s1.length();i++)
		{
		s2=s2+s1.charAt(i);
	}
		System.out.println(s2);

}
}
