class superclass
{
	String color="blue";
	superclass(int a)
	{
		System.out.println("Superclass constructor called! value passed: "+a);
	}
	void message()
	{
		System.out.println("Message from superclass");
	}
	
}
class subclass extends superclass
{
	String color="Black";
	void message()
	{
		System.out.println("Message from subclass!");
	}
	subclass(int a)
	{
		super(a);
		System.out.println("Subclass constructor called!");
		System.out.println("My color: " +color+" Super color: "+super.color);
		message();
		super.message();
	}
	
}
public class lab19 {

	public static void main(String[] args)
	{
		subclass obj=new subclass(5);
	}

}
