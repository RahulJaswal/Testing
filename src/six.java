/*Java code to remove duplicate values from an array 
For Example : Array a has values [Anu, Abhijeet, Simran, Amit, Harshita, Kuldeep, Anu, Hasleen, Amit ]
Output will remove all the duplicate values from array of Strings*/

public class six {

	public static void main(String[] args) 
	{
		String a[]={"rahul","anjali","sikhu","abhi","rahul","sikhu","asdfha"};
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			int j=i;
			int count=0;
			while(j>=0)
			{
				if(a[i].equals(a[j]))
				{
					count++;
				}
				j--;
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}

	}

}
