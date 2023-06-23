package String;

import java.util.Scanner;

public class PW {

	public static void main(String[] args)  {
		int count=0;
		Scanner d=new Scanner(System.in);
		System.out.println("please Create your password");
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
	if(UPC>=1&&LOC>=1&&DIC>=1&&SPC>=1&&tot<=32&&tot>=6 && (s1.charAt(0)!=' ')&&(s1.charAt(s1.length()-1)!=' '))
	{ 
		System.out.println("password successfully created");
		count++;
	}
	else if(tot<6)
	{
		System.out.println("please enter min 6 char");
	}
	else if(tot>32)
	{
		System.out.println("length should be within 32 char");
	}
	else if(!(UPC>=1&&LOC>=1&&DIC>=1&&SPC>=1))
			{System.out.println("weak passwod");}
	if(count>=1) {
	System.out.println();
	System.out.print("ENTER YOUR USER NAME : ");
	String f=d.nextLine();
	System.out.println();
	System.out.print("ENTER YOUR  PASSWORD : ");
	System.out.println();
	String h=d.nextLine();
	if(h.equals(s1))
	{
		System.out.print("user successfully login");
	}
	else
	{System.out.print("ENTER VALID PASSWORD");}
}
}}

	
