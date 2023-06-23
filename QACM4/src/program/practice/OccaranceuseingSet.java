package program.practice;

import java.util.HashSet;
import java.util.Set;

public class OccaranceuseingSet {

	public static void main(String[] args) {
		String s="Testyanta";
		Set<Character> duplicates=new HashSet<>();
		for(char c:s.toCharArray()) {
			duplicates.add(c);
		}
		System.out.println("charactor occrance");
		for(char c:duplicates) {
			int count=0;
			for(char ch:s.toCharArray()) {
				if(c==ch) {
					count++;
				}
			}
			System.out.println(c+":"+count);
		}

	}

}
