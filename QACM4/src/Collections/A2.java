package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n number");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(s.nextInt());
		}
		System.out.println(al);
	}

	
	}
