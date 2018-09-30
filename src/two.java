//to count vovals and conconents of string
public class two {

	public static void main(String[] args) 
	{
		String s[]={"A","E","I","O","U","a","e","i","o","u"};
		String a[]=new String[10];
		int vov=0,con=0,l=args[0].length();
		int i=0;
		
		while(l>0)
		{
			a[i]=args[0].substring(l-1,l);
			l--;
			i++;
		}

		for(i=0;i<args[0].length();i++)
		{
			int vov2=vov;
			for(int j=0;j<10;j++)
			{
				if (a[i].equals(s[j]))
				{
					vov++;
				
				}
			}
			if(vov==vov2)
			{
				con++;
			}
		}
		System.out.println("String:"+args[0]);
		System.out.println("vovels="+vov);
		System.out.println("conconents="+con);
	}

}
