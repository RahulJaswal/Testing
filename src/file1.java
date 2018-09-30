//to open and display file
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class file1 {

	public static void main(String[] args)  
	{
		File file=new File("F:\\my doc\\testd.txt");
		FileWriter pr=null;
		FileReader ins=null;
		 try 
		 {
			pr= new FileWriter(file);
			 pr.write("Hi my name is Rahul");
				pr.close();	
		}
		 catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
		try
		{
			ins=new FileReader(file);
			int ch;
			while((ch=ins.read()) !=-1)
			{
				System.out.print((char)ch);
			}
			ins.close();
			
		}
		catch(IOException e)
		{
			System.out.print("unable to open file");
		}/*
		finally
		{
			try 
			{
			
				ins.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}*/
	}

}
