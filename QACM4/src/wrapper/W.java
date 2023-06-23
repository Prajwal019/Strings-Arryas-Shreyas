package wrapper;

public class W {

	public static void print(Character a)
	{System.out.println("from character");
	System.out.println(a);
	}
	public static void print(char ch)
	{System.out.println("from char");
	System.out.println(ch);
	}
	public static void main(String[] args) {
		print(Character.valueOf('A'));
	}

	}
