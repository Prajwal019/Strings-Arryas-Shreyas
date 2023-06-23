package programs.pattern;

public class P6 {
	public static void main(String[] args) {char a='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					System.out.print(a+++" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}}

