package Thread;

public class T1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("thread begin");
		System.out.println("thread id :"+Thread.currentThread().getId());
		System.out.println("thread name :"+Thread.currentThread().getName());
		System.out.println("thread priority :"+Thread.currentThread().getPriority());	
	   System.out.println(Thread.currentThread());
		for(int i=0;i<4;i++)
	    {
	    	System.out.println("i :"+i);
	    	Thread.sleep(3000);
	    }
	}

}

