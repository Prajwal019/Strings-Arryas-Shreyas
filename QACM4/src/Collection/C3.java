package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList ls=new ArrayList();
       System.out.println("enter the n number");
       int n=s.nextInt();
       for(int i=0;i<n;i++)
       {
    	   ls.add(s.nextInt());
       }
       System.out.println(ls);
       System.out.println(ls.isEmpty());
       System.out.println(ls.size());
       System.out.println(ls.contains(10));
	}

}
