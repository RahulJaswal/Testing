final class base //class base cannot be inherited!
{
	final int a=5; //now value of a cannot be changed.
	final void display()  //display() cannot be redefined by any class.
	{
		System.out.println("This is display message from base class!");
	}
}
public class lab18 {

	public static void main(String[] args)
	{
		base obj=new base();
		obj.display();
	}

}
