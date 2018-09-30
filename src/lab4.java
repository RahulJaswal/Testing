import java.util.Scanner;
public class lab4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		String st=s.next();
		System.out.println("The reverse is :");
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}

	}

}
