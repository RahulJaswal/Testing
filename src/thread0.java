class temp0
{
	 public void data(int n)
	{
		for(int i=1;i<6;i++)
		{
			System.out.println(i*n);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class thread4 extends Thread
{
	
	temp t;
	thread4(temp t)
	{
		this.t=t;
	}
	public void run()
	{
		t.data(5);
	}
}
class thread3 extends Thread
{
	temp t;
	thread3(temp t)
	{
		this.t=t;
	}
	public void run()
	{
		t.data(3);
	}
}

public class thread0 {

	public static void main(String[] args)
	{
		temp t=new temp();
		thread4 obj=new thread4(t);
		thread3 obj2=new thread3(t);
		obj.start();
		obj2.start();
	}

}
