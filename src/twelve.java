import java.util.StringTokenizer;
//implementing StringTokenizer;
public class twelve {

	public static void main(String[] args)
	{
		StringTokenizer s=new StringTokenizer("hello java");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
		
	}

}
