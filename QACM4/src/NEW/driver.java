package NEW;
import java.util.Scanner;

public class driver {
		public static void main(String[] args) throws InterruptedException
		{
			Scanner s=new Scanner(System.in);
			System.out.println("do you love me");
				String status=s.nextLine().toUpperCase();
			{
				if(status.equals("YES"))
				{
					
					S aa=new S();
					aa.main();
					
				}
					else if(status.equals("NO"))
				{
						NS s1=new NS();
						s1.tq();

				}
					else
					{
						System.out.println("please tell me");
					}
			}
		}
}
