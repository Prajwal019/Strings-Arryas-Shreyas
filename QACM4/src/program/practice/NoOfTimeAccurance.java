package program.practice;

public class NoOfTimeAccurance {
	public static void main(String[] args) { 
		String sentence = "This is a sample sentence. This sentence contains the word 'sample' multiple times.";
		String wordToCount = "sample"; 
		int count = countOccurrences(sentence, wordToCount); 
		System.out.println("The word '" + wordToCount + "' occurs " + count + " times in the sentence."); } 
	public static int countOccurrences(String sentence, String word) { 
		int count = 0; 
		String[] words = sentence.split("\\s+");
		for (String w : words) { 
			if (w.equals(word))
			{ 
				count++;
			} } 
		return count; 
		}
	}
