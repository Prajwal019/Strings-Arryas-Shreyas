package program.practice;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
	int num=6;
	int res = isfactroil(num);
	System.out.println(res);
	}

	public static int isfactroil(int num) {
		System.out.println(num);	
		if(num==0) {
			
			return 1;
	}
	
		else{
		return num*isfactroil(num-1);
	
	}
		
}
}
