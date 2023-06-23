package programs;

import java.util.Scanner;

public class twoDaraySmallest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row and col size");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][]a=new int[row][col];
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[0].length;j++) {
        		
        	a[i][j]=sc.nextInt();
        }
	}
        int res=issmallest(a);
        System.out.println(res);
        }

	public static int issmallest(int[][] a) {
		int small=a[0][0];
		for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++) {
        		
        	if(a[i][j]<small)
        		small=a[i][j];
        }
		
	}return small;
	
	}}

