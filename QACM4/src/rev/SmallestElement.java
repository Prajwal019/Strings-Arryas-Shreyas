package rev;
//w.j.p to find smallest element present in the array
import java.util.Scanner;

public class SmallestElement {
		public static void main(String[] args) {
			Scanner s=new Scanner (System.in);
			System.out.println("enter the size of the array");
				int size=s.nextInt();
				int []a=new int[size];
				System.out.println("enter the "+size+" values");
				for (int i = 0; i < a.length; i++) {
					 a[i] = s.nextInt();
					 }
				int small=a[0];
					for (int i = 0; i < a.length; i++) {
						if(a[i]<small) {
							small=(a[i]);
							}
						
						
					}
		
			System.out.println(small);

		}}
