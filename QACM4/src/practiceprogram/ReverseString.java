package practiceprogram;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
String s="all the best";
String [] s1=s.split(" ");
String rev="";
for(int i=s1.length-1;i>=0;i--) {
	
	rev=rev+s1[i]+" ";
}

System.out.println(rev);

	}
}
