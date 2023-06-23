package javaprograms;

public class largeString {

	public static void main(String[] args) {
	String s="i am Shreyas from thirthahalli Basavani";
	String[]s1=s.split(" ");
	String largest=s1[0];
	for(int i=0;i<s1.length;i++) {
		if(s1[i].length()>largest.length()) {
			largest=s1[i];
		}}
		System.out.println(largest);

	}

}
