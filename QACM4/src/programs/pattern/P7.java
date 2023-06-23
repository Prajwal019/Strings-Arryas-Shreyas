package programs.pattern;

public class P7 {
	public static void main(String[] args) {char a='a'; int n=5;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j==n-1) {
				System.out.print(a+++" ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}

}}



