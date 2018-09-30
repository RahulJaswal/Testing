//to count ascii values of characters in String
 public class three {

	public static void main(String[] args) 
	{
		char a[]=new char [10];
		int l=args[0].length(),i=0;
		while(l>0)
		{
			a[i]=args[0].charAt(l-1);
			//System.out.println(a[i]);
			l--;
			i++;
		}

		int b[]=new int[10];
		for(i=args[0].length()-1;i>-1;i--)
		{
			b[i]=(int) a[i];
			System.out.println(a[i]+"="+b[i]);
		}

	}

}
