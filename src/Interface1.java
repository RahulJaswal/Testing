interface one
{
	public one display();
}
class dummy implements one
{

	@Override
	public one display() {
		// TODO Auto-generated method stub
		dummy obj=new dummy();
		return obj;
	}

}

public class Interface1 
{	
	
	public static one display()
	{
		System.out.println("hello");
		
		return new dummy(); 
	}
	public void play()
	{
		System.out.println("Method play");
	}
	public static void main(String[] args)
	{
		Interface1 obj=new Interface1();
		one obj2= Interface1.display();
		
		obj2.display();
		
	}

}
