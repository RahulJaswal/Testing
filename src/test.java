import java.util.Scanner;
public class test {

	public static void main(String[] args)
	{
		Scanner obj =new Scanner(System.in);
		String a=new String (obj.nextLine());
		String b[]=a.split("\\s");
		for(String t:b)
		{
			System.out.println(t);
		}
		a=a.replace('a','i');
		System.out.println(a);
		a=a.concat(" will be concated");
		System.out.println(a);
		a=a.trim();
		System.out.println(a);
		System.out.println(a.indexOf('j',2));
		System.out.println(a.compareTo(b[1]));
		System.out.println("hello"+Integer.toString(4+4));
	
		
		

	}

}
