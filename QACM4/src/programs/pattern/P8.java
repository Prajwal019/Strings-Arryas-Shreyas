package programs.pattern;

public class P8 {
	public static void main(String[] args) {int a=1;int n=5;
	for(int i=0;i<4;i++) {
		for(int j=0;j<5;j++) {
			if(i==0||j==0||i==4-1||j==n-1) {
				if(a==10) {
					a=1;
					}
				System.out.print(a+++" ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}

}}


