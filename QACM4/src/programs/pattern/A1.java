package programs.pattern;

public class A1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					if(j%2==0) {
					System.out.print(1+" ");
				}
					else {
						System.out.print(0+" ");}
					}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}}
