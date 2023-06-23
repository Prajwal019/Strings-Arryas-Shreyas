package programs;

public class P5 {

	public static void main(String[] args) {
		int n=9;
		
		for(int i=1; i<=n;i++) 
		{
			int k=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++) {
				if(j<i) {
				System.out.print(k+++" ");}
			
			else
			 {
				System.out.print(k--+" ");}
			}
			System.out.println();
		}

	}}

