interface two
{
	void display();
}
public class sixteen {

	public static void main(String[] args) 
	{
		two obj=new two()
		{
			public void display()
			{
				System.out.println("this is java");
			}
		};
		obj.display();
	}

}
