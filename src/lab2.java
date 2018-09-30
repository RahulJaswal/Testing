import java.util.Scanner;
public class lab2 {

	public static void main(String[] args) 
	{
		System.out.println("Enter any number:");
		Scanner t=new Scanner(System.in);
		int a=t.nextInt();
		System.out.println("test a:"+a);
		int A[]=new int[10];
		int i=1,b=a,s=0;
		A[0]=0;
		while(b>0)
		{
			A[i]= b%10;
			b=b/10;
			i++;
		}
		
		while(i>0)
		{
			s=(int) (s+ Math.pow(A[i],A[i-1]));
			i--;
		}
		System.out.println("the sum is :"+s);
		
	}

}
