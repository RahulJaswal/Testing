class test1
{
	static int count=0;
	test1()
	{
		count++;
	}
	void check()
	{
		System.out.println("Number of constructors created: "+count);
	}
}
public class lab16 {

	public static void main(String[] args) 
	{
		test1 obj=new test1();
		test1 obj2=new test1();
		obj2.check();

	}

}
