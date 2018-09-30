import java.util.Scanner;
public class lab12 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("MENU:");
		System.out.println("Press 1 for numeric sort.");
		System.out.println("Press 2 for character sort");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
		
			System.out.println("Enter 5 numbers:");
			for(int i=0;i<5;i++)
			{
				a[i]=s.nextInt();
			}
			int j=4;
			while(j>0)
			{
				for(int i=0;i<4;i++)
				{
					if(a[i]>a[i+1])
					{
						int temp=a[i+1];
						a[i+1]=a[i];
						a[i]=temp;
					}
				}
			j--;
			}
			System.out.println("Sorted values are:");
			for(int i:a)
			{
				System.out.print(" "+i);
			}
		case 2:
			String c[]=new String[5];
			System.out.println("Enter 5 characters:");
			for(int i=0;i<5;i++)
			{
				c[i]=s.next();
			}
			j=4;
			while(j>0)
			{
				for(int i=0;i<4;i++)
				{
					if((int)c[i].charAt(0)>(int)c[i+1].charAt(0))
					{
						String temp=c[i+1];
						c[i+1]=c[i];
						c[i]=temp;
					}
				}
			j--;
			}
			System.out.println("Sorted characters are:");
			for(String st:c)
			{
				System.out.print(st+" ");
			}
	}

}}
