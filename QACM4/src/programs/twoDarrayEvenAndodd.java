package programs;

import java.util.Scanner;

public class twoDarrayEvenAndodd {
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
        int []res=evenOdd(a);
        System.out.println("no even element :"+res[0]);
        System.out.println("no odd element :"+res[1]);
        }

	public static int[] evenOdd(int[][] a) {
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++) {
        		
        	
			if(a[i][j]%2==0)
        		even++;
        	else
        		odd++;
        		
        }
		
	}
		int[]b= {even,odd};return b;
	
	}}
