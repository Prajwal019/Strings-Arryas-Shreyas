package programs;

import java.util.HashSet;
import java.util.Set;

public class occurance {

		public static void main(String[] args) {
	        String str = "sridhara is a lover boy";
	        Set<Character> uniqueChars = new HashSet<>();
	        
	        for (char c : str.toCharArray()) {
	            uniqueChars.add(c);
	        }
	        
	        System.out.println("Character occurrence:");
	        for (char c : uniqueChars) {
	            int count = 0;
	            for (char ch : str.toCharArray()) {
	                if (c == ch) {
	                    count++;
	                }
	            }
	            System.out.println(c + ": " + count);
	        }
	    }
	}



