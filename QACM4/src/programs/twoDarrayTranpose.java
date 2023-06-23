package programs;

import java.util.Scanner;

public class twoDarrayTranpose {
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
        int [][]res=evenOdd(a);
        for(int i=0;i<res.length;i++)
        {
        	for(int j=0;j<res[i].length;j++) {
        		
        		 System.out.print(res[i][j]+" ");
        }
        	System.out.println();
	}
       
        
        }

	public static int[][] evenOdd(int[] []a) {
		int [][]c=new int[a[0].length][a.length];
		
		for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[0].length;j++) {
        		c[j][i]=a[i][j];
        	
        		
        }
		
	}
		return c;
	
	}}

