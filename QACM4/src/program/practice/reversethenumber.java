package program.practice;

public class reversethenumber {

	public static void main(String[] args) {
String s="All the best";
String[] s1=s.split(" ");
int l=s1.length-1;
String res=reverse(s1,l);
System.out.println(res);

	}
	public static String reverse(String[] s1,int l) {
		String rve="";
		if(l<0) {
			return rve;
		}
		return (rve=rve+s1[l--]+" ")+reverse(s1,l);
	}

}
