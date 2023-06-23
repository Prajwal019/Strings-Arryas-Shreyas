package wrapper;

public class primitivetononprimitive {

	public static void main(String[] args) {
		int a=10;
		Integer b=a;
		System.out.println(b);
	    Integer c=Integer.valueOf(a);
	    System.out.println(c);
	    Object d="shreyas";
	    Object e=10;
	    Object f=44.80;
	    Object g=true; 
	    System.out.println(d);
	    System.out.println(e);
	    System.out.println(f);

	}

}
