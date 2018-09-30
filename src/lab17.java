class aadhar
{
	String name,address;
	int age,phno;
	aadhar()
	{
		name="Rahul";
		address="sec-15 pkl";
		age=90;
		phno=1234;
	}
	void adisplay()
	{
		System.out.printf("Name: %s Address: %s age= %d phno.= %d",name,address,age,phno);
	}
}
class id extends aadhar
{
	private String clas;
	private int roll_no;
	id()
	{
		clas="MCA";
		roll_no=179543;
	}
	void idisplay()
	{
		adisplay();
		System.out.println("Class="+clas+" roll_no="+roll_no);
	}
}
class Bpass extends aadhar
{
	private int root;
	Bpass()
	{
		root=1;
	}
	void Bdisplay()
	{
		adisplay();
		System.out.println("Root No="+root);
	}
}


public class lab17 {

	public static void main(String[] args)
	{
		id obj=new id();
		Bpass obj2=new Bpass();
		obj.idisplay();
		obj2.Bdisplay();
	}

}
