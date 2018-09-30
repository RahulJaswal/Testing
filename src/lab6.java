import java.util.Scanner;
class student
{
	int a,b,sum;
	Scanner s=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter marks for Maths:");
		a=s.nextInt();
		System.out.println("Enter marks for English:");
		b=s.nextInt();
		sum=a+b;
	}
}
public class lab6 {

	public static void main(String[] args)
	{
		student obj[]=new student[10];
		for(int i=0;i<10;i++)
		{
			obj[i]=new student();
			obj[i].getdata();
		}
		int gr=obj[0].sum,count=1;
		for(int i=0;i<10;i++)
		{
			if(gr<obj[i].sum)
			{
				gr=obj[i].sum;
				count=i+1;
			}
		}
		System.out.println(count+"th student has obtained largest marks: "+gr);
	}

}

