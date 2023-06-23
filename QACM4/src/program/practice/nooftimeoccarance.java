package program.practice;

import java.util.HashSet;
import java.util.Set;

public class nooftimeoccarance {

	public static void main(String[] args) {
		String s="Testyantra";
		Set<Character> ha=new HashSet<>();
		for(char c:s.toCharArray()) {
			ha.add(c);
		}
		System.out.println("character occareance");
		for(char c:ha) {
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
