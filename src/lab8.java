
public class lab8 {
	int a;
	void get(int a)
	{
		this.a=a;
		System.out.println("Value initialized with this operator is "+this.a);
	}

	public static void main(String[] args) 
	{
		lab8 obj=new lab8();
		obj.get(5);

	}

}
