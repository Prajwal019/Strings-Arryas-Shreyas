package program.practice;

public class EvenNumberWithoutUseingLoop {

	    public static void main(String[] args) {
	        printEvenNumbers(20);
	    }

	    public static void printEvenNumbers(int num) {
	        if (num <= 30) {
	            System.out.println(num);
	            printEvenNumbers(num + 2);
	        }
	    }
	}
