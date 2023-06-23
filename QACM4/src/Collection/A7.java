package Collection;

import java.util.ArrayList;

	public class A7 {

		public static ArrayList toList(int[]arr)
		{
			ArrayList b=new ArrayList();
			for(int i:arr)
			{b.add(i);}
			return b;
		}
		public static void main(String[] args) {
			int []a= {10,26,76,98,87};
			ArrayList b=toList(a);
			System.out.println(b);

		}
		}
