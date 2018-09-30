/*Problem 11

1.  String input1 = Rajiv

String input2 = Roy (input1 and input2, is provided on runtime)

 

2.  Compare Strings and LongerName is having the string with larger length and SmallerName is having the string with smaller length.

 

3.  input3 is having the pin code = 560037

 

4.  input 4 is having a number for example N=6

 

5.  The String output1 should provide the result : yRajiv75 ( i.e. last character of Smallername String, LargerName String, Nth number from left to right and nth Number from right to left).

 

6.  Inverse the cases. y -> Y, R->r and so on.. so for the dummy inputs given the output should be : YrAJIV75*/import java.util.Scanner;

public class eight {

	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1=S.nextLine();
		System.out.println("Enter second string:");
		String s2=S.nextLine();
		
		int l1=s1.length(),l2=s2.length();
		System.out.println("enter a pin of 6 digits:");
		String pin=S.nextLine();
		System.out.println("Enter value for N:");
		int  n=S.nextInt();
		
		if(l1>l2)
		{
			System.out.println(s2.charAt(l2-1)+s1+pin.charAt(n-1)+pin.charAt(pin.length()-n));
		}
		else
		{
			System.out.println(s1.charAt(l1-1)+s1+pin.charAt(n-1)+pin.charAt(pin.length()-n));
		}	
	}
}
