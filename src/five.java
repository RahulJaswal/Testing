/*User is going to input a String for example : "Wipro Technologies". You have to display a variable
PIN which contains value of the example string as 125,Because Technologies has length = 12 and Wipro has
length = 5.*/

import java.util.Scanner;
public class five {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String");
		String a =obj.nextLine();

	
		int l= a.length();
		int i=0;
		while(a.charAt(i)!=' ')
		{
				i++;
		}
		String b=a.substring(0,i);
		a=a.substring(i+1,l);
		l=a.length();
		int c=b.length();
		
		System.out.println(l+""+c);

	}

}
