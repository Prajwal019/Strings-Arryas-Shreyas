package programs;

import java.util.Scanner;

public class noOfSpeisl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int spl=0;
		for(int i=0;i<s.length();i++) {
		int ch = s.charAt(i);
		if(!(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')) {
	spl++;
	}

}System.out.println(spl);
		}


}
