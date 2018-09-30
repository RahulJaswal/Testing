class temp
{
	public synchronized void data(int n) throws InterruptedException
	{
		for(int i=1;i<6;i++)
		{
			System.out.println(i*n);
			Thread.sleep(100);
		}
	}
}

class thread00 extends Thread
{
	
	temp t;
	thread00(temp t)
	{
		this.t=t;
	}
	public  void run()
	{
		t.data(5);
	}
}
class thread2 extends Thread
{
	temp t;
	thread2(temp t)
	{
		this.t=t;
	}
	public void run()
	{
		t.data(3);
	}
}

public class thread1 {

	public static void main(String[] args)
	{
		temp t=new temp();
		thread00 obj=new thread00(t);
		thread2 obj2=new thread2(t);
		obj.start();
		obj2.start();
	}

}
