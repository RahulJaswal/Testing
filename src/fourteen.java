//Lab prog 10;

public class fourteen {

	public static void main(String[] args)
	{
		int a[]={2,5,1,7,9,3};
		int e[]=new int[a.length];
		int o[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				e[i]=a[i];
			}
			else
				e[i]=a[i]+a[i+1];
		}
		for(int i=e.length-1;i>=0;i--)
		{
			if(i==e.length-1)
			{
				o[i]=e[i];
			}
			else
			o[i]=e[i]-o[i+1];
		}
		for(int i:a)
		{
			System.out.print(" "+i);
		}
		System.out.println("\nencodded array");
		for(int i:e)
		{
			System.out.print(" "+i);
		}
		System.out.println("\noriginal array");
		int sm=0;
		for(int i:o)
		{
			System.out.print(" "+i);
			sm=sm+i;
		}
		System.out.println("\n value at index 0: "+o[0]);
		System.out.println("Sum of all elements: "+sm);
	}

}
