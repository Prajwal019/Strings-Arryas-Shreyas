package programs.pattern;

public class P9 {
	public static void main(String[] args) {
		char ch='a';
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(i==0||j==0||i==5-1||j==5-1||i==j||i+j==5-1||j%2==1) {
				if(ch=='l')
				{
					ch='L';
					}
				System.out.print(ch+++" ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}

}}

