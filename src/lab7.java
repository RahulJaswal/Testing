//lab7+lab8
public class lab7 
{
	int a,b;
	lab7()
	{
		System.out.println("This is default constructor");
	}
	lab7(int a,int b)
	{
		this.a=a;
		this.b=b;
		int temp=a+b;
		System.out.println("This is parameterised constructor");
		System.out.println("sum:"+temp);
	}
	lab7(double a,double b)
	{
		double temp=a+b;
		System.out.println("This is parametrised constructor");
		System.out.println("SUm:"+temp);
	}
	lab7(lab7 obj)
	{
		System.out.println("This is copy constructor:");
		System.out.println("Accessing with the help of obj:"+obj.a+" "+obj.b);
	}
	
	public static void main(String[] args) 
	{
		lab7 obj1=new lab7();
		lab7 obj2=new lab7(3,6);
		lab7 obj3=new lab7(obj1);
		
	}

}
