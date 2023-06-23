package ArrayPractice;

public class CharArray {
	public static void main(String[] args) {
		char[]ch = {'a','p','p','l','e'};
		int a=0;
		int d=ch.length-1;
		while(a<d) {
		char temp=ch[a];
		ch[a]=ch[d];
		ch[d]=temp;
		a++;
		d--;
		}	
		
		System.out.println(ch);
	}

}

