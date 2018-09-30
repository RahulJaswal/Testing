
public class lab13 {

	public static void main(String[] args)
	{
		int count=0,flag=0;
		if(args[0].length()<8 || args[0].length()>15)
		{
			System.out.println("Passoword length should lie btw 8-15");
			flag=1;
		}
		
		for(int i=0; i<args.length;i++)
		{
			if((int)args[0].charAt(i)> 122 || (int)args[0].charAt(i) <48)
			{
				System.out.println("Password should include only characters and numbers.");
				flag=1;
			}
			else if((int)args[0].charAt(i) >57 && (int)args[0].charAt(i)<65)
			{
				System.out.println("Password should include only characters and numbers.");
				flag=1;
			}
			else if((int)args[0].charAt(i)>90 &&(int)args[0].charAt(i)<97)
			{
				System.out.println("Password should include only characters and numbers.");
				flag=1;
			}
			else if((int)args[0].charAt(i)>=48 &&(int)args[0].charAt(i)<=5)
			{
				count++;
			}
		}
		if (count<=3 && flag==0)
		{
			System.out.println("Password accepted.");
		}
		else if(flag==1 && count>3)
		{
			System.out.println("Password is not accepted.");
		}
	}
}
	
	


