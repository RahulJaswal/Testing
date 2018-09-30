import java.util.Scanner;
public class ten {

	public static void main(String[] args) 
	{
	
		System.out.println("Enter any number:");
		Scanner s=new Scanner(System.in);
		String num=s.nextLine();
		int sum=0;
		int bound=num.length();
		while(bound>0)
		{
			int j=0;
			while(j<bound)
			{
				
				sum=sum+Integer.parseInt(num.substring(j, j+1));
				j++;
			}
			bound--;
		}
		System.out.println("sum="+sum);
		}
}
