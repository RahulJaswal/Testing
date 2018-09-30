import java.util.Scanner;
public class lab20 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first string: ");
		String a=s.nextLine();
		System.out.println("Enter second string: ");
		String b=s.nextLine();
		
		String A[]=a.split("\\s");
		for(String i:A)
		{
			System.out.println(i);
		}
	}
}
