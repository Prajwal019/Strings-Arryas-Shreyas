package practiceprogram;

import java.util.Scanner;

public class wordoccrance {

	public static void main(String[] args) {
		String s="we can not end the sentance with because because because is conjuction";
		String [] s1=s.split(" ");
		boolean[] b=new boolean[s1.length];
		for(int i=0;i<s1.length;i++) {
			int count=1;
			if(b[i]==false) {
				for(int j=i+1;j<s1.length;j++) {
					if(s1[i]==(s1[j])) {
						count++;
						b[j]=true;
					}
					
				}
			}
			if(count>1) {
			System.out.println(s1[i]+":"+count);}
		}

	}

}
