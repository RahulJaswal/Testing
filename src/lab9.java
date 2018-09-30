//to remove duplicate values from array;
import java.util.Scanner;
public class lab9 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		int i,j,f;
		for(i=0;i<5;i++)
		{
			j=i-1;
			f=0;
			while(j>=0)
			{
				if(a[i]==a[j])
				{
					f=1;
				}
				j--;
			}
			if(f==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
