package rev;
//w.j.p to find the largest string
import java.util.Scanner;

public class LargestStringArray {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the size of the array");
			int size=s.nextInt();
			String []a=new String[size];
			System.out.println("enter the "+size+" String");
			s.nextLine();
			for (int i = 0; i < a.length; i++) {
				 a[i] = s.nextLine();
				 }
			int l1=a[0].length();
			String larstr=a[0];
				for (int i = 1; i < a.length; i++) {
					int l2=a[i].length();
					if(l2>l1) {
						larstr=a[i];	
					}
					
				}
	
		System.out.println(larstr);

	}}


