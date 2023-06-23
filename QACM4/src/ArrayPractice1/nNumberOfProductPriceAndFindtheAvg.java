package ArrayPractice1;

import java.util.Scanner;

public class nNumberOfProductPriceAndFindtheAvg {

	public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
      int size=Sc.nextInt();
      double sum=0;
      double[] d=new double[size];
      for(int i=0;i<d.length;i++) {
    	  d[i]=Sc.nextDouble();
      }
      for(int i=0;i<d.length;i++) {
    	  sum=sum+d[i];
      }
      double avg=sum/d.length;
      System.out.println(avg);
	}

}
