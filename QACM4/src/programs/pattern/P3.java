package programs.pattern;

public class P3 {
	public static void main(String[] args) {int k=1;char ch='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i%2==0) {
					if(j%2==0) {
						System.out.print(k+" ");
					}
					else
						System.out.print(ch+" ");
				}
					else
						if(j%2==1) {
							System.out.print(ch+" ");
						}
						else
							System.out.print(k+" ");}
			k++;
			ch++;
			System.out.println();
		}

	}
}
