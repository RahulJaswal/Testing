//lab 11
public class lab11 {

	public static void main(String[] args) 
	{
		String a[]={"vinay", "arun", "deepak", "shetal", "vinay", "deepak"};
		int count=0,j;
		for(int i=0;i<a.length;i++)
		{
			j=i+1;
			while(j<a.length)
			{
				if(a[i].equals(a[j]))
				{
					count++;
				}
				j++;
			}
		}
		System.out.println("Repeated Strings:"+count);

	}

}
