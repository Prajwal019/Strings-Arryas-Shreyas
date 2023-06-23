package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList ls=new ArrayList();
		System.out.println("Enter the M value");
		int M=s.nextInt();
		System.out.println("Enter the M value");
		int N=s.nextInt();
		while(M<N)
		{
			int c=0;
			for(int i=2;i<M;i++)
			{
				if(M%i==0)
				{
					c++;
					break;
				}
			}
			if(c==0) {
				ls.add(M);
			}M++;
		}
		System.out.println(ls);
	}
}
		
		
