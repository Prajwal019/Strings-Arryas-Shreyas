package rev;

import java.util.Scanner;

public class Password {
	public static void main(String[] args)  {
		int count=0;
		Scanner d=new Scanner(System.in);
		System.out.println("enter user name");
	String s1=d.nextLine();
	int UPC=0;
	int LOC=0;
	int DIC=0;
	int SPC=0;
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			 UPC++;
	}
		else if (ch>='a'&&ch<='z')
		{
			LOC++;
		}
		else if (ch>='0'&&ch<='9')
		{
			DIC++;
		}

		else
	{
		SPC++;
	}
	}
	int tot=UPC+LOC+DIC+SPC;
	if(UPC>=1&&LOC>=1&&DIC>=2&&SPC>=1&&tot>=8)
	{ 
		System.out.println("user name is valid");
		count++;
	}
	else
	{
		System.out.println("user name is invalid");
	}
	
}}

