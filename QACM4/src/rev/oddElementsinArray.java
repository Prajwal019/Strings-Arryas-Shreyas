package rev;
//w.j.p to find odd elements present in the array


import java.util.Scanner;

public class oddElementsinArray {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the size of the array");
			int size=s.nextInt();
			int []a=new int[size];
			System.out.println("enter the "+size+" values");
			for (int i = 0; i < a.length; i++) {
				 a[i] = s.nextInt();}
				for (int i = 0; i < a.length; i++) {
					if(a[i]%2==1) {System.out.println(a[i]);}
					
				}
	
		}

	}

