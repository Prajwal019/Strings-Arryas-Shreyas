package NEW;

public class S 
	{
	  void main() throws InterruptedException
	{ 
			System.out.println();
			System.out.println();
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=22;j++)
			{
			 if(i==1&&j<6||j==3||i==6&&j<6||j==17||i==6&&j>16||j==22||i>2&&j-i==5||i>2&&i+j==17||i==2&&(j==8||j==11||j==14)||i==1&&(j==9||j==10||j==12||j==13))
				{
		System.out.print("* ");
		Thread.sleep(45);
	}
	else
				{
		System.out.print("  ");
				}
			}
			{
				System.out.println();
}
		}
	}
}
