package programs;

public class P4 {

	public static void main(String[] args) {
		int n=9;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
