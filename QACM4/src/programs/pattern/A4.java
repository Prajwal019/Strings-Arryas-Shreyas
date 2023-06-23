package programs.pattern;

public class A4 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				
					System.out.print("  ");
				}
			for(int j=0;j<2*i-1;j++) {
				if(j%2==0) {
						System.out.print(1+" ");
			}
				else {
					System.out.print(0+" ");
				}}
			System.out.println();
		}

	}}
