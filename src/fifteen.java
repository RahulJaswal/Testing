interface one
{
	int a=12;
	void date();
	interface onein{
		void play();
	}
}
public class fifteen implements one  {
	public void date()
	{
		System.out.println("today is "+ a +"/09/2017");
	
	}
	void play()
	{
		System.out.println("play function");
	}
	

	public static void main(String[] args)
	{
		fifteen obj=new fifteen();
		obj.date();

	}

}
