/*14. Java code to check if a given string contains the specified sequence of char values 
[ for example :  Input String : Sangeeta , Search String : geeta 
Output Return is Yes, Sangeeta contains geeta ]*/
import java.util.Scanner;
public class seven {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		int i,count=0;
		for(i=0;i<(s.length()-4);i++)//here using 4 because actual length of geeta is 5.
		{
			String k=s.substring(i,i+5);
			if(s.substring(i,i+5).equals("geeta"))
			{
				System.out.println("yes "+s+" contains geeta");
				count=1;
			}
		}
		if (count==0)
		{
			System.out.println("not available");
		}

	}

}
