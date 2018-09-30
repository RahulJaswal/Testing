interface inter
{
	public void fun();
	
}
public class Check
{
	
	public static void main(String[] args) 
	{
		/*inter obj=new inter()
				{
					public void fun()
					{
						System.out.println("hello");
					}
				};*/
		inter obj;
		obj=()->
		{
			System.out.println("hell0");
		};
		obj.fun();

	}

}
