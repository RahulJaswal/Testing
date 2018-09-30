//Implementing autoboxing and unboxing.
class rah{
	int a=3;
	int b;
	rah(int a, int b)
	{
		System.out.println(this.a +" "+a);
		a=this.a;
		this.b=b;
		System.out.println(this.a+" "+a);
		
	}
}
public class nine {

	public static void main(String[] args)
	{
		//auto boxing ie.taking static int to heap.
		int a=10;
		rah obj=new rah(5,10);
		Integer b=new Integer(a);
		System.out.println("b="+b);
		
		//unboxing ie. taking dynamic Integer to stack int;
		Integer i=new Integer(20);
		int c=Integer.valueOf(i);//or we can write int c=i;
		System.out.println("c="+c);
		
	}

}
