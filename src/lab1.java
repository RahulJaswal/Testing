//lab1+lab 4
import java.util.Scanner;
public class lab1 {

	public static void main(String[] args)
	{
		
		System.out.println("MENU");
		System.out.println( "Press 1 for Factorial.");
		System.out.println("Press 2 for Fibonacci.");
		System.out.println("Press 3 for Prime number");
		System.out.println("Press 4 for Reverse a number.");

		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the number:");
			int a=s.nextInt();
			int t=1;
			while(a>0)
			{
				t=t*a;
				a--;
			}
			System.out.println("Factorial is :"+t);
			
		case 2:
			System.out.println("Enter a number till the fibonacci series will be :");
			int f=s.nextInt();
			
			int temp,x=0,y=1;
			System.out.print("Series: 0");
			while(y<=f)
			{
				System.out.print(" "+y);
				temp=y;
				y=x+y;
				x=temp;
				
			}
		case 3:
			System.out.println("Enter the number:");
			int n=s.nextInt();
			int flag=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println("Number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number is prime.");
			}
		case 4:
			System.out.println("Enter a number:");
			String st=s.next();
			for(int i=st.length()-1;i>=0;i--)
			{
				System.out.print(st.charAt(i));
			}
		default:
		{
			//System.out.println("wrong input!");
		
			}
			
		}
	}
	}


