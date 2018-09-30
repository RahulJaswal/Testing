import java.io.*;
public class file3 {

	public static void main(String[] args)
	{
		File file=new File("f:\\my doc\\testd.txt");
		File file2=new File("f:\\my doc\\test.txt");
		FileInputStream fis=null;
		FileOutputStream fout=null;
		try
		{
			fis=new FileInputStream(file);
			fout=new FileOutputStream(file2);
			int ch;
			while((ch=fis.read())!=-1)
			{
				fout.write(ch);
			}
			fis.close();
			fout.close();
			
			
		}
		catch(IOException e)
		{
			System.out.println("io error");
		}
	}

}
