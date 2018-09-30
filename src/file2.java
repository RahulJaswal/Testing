//to copy files
import java.io.*;
public class file2 {

	public static void main(String[] args) 
	{
		FileReader rd =null;
		FileWriter wt=null;
		try
		{
			rd=new FileReader("F:\\my doc\\test.txt");
			wt=new FileWriter("F:\\my doc\\testd.txt");
			
			int ch;
			while((ch= rd.read()) !=-1)
			{
				wt.write(ch);
				
			}
		}
		catch(IOException e)
		{
			System.out.println("I/o error!");
		}
	
		
		finally
		{
			
			try 
			{
			rd.close();
			wt.close();
			System.out.println("Copied successfully!");
			}
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			
		}
	}

}
