//use of Enumeration and vectors;
import java.util.Vector;
import java.util.Enumeration;

public class thirteen {

	public static void main(String[] args) 
	{
		@Suppresswarning
		Vector<Integer> v=new <Integer>Vector(4,3);
		v.addElement(2);
		v.addElement(3);
		//v.add(2,10);
		int a=10;
		System.out.println(v.elements()+""+v);
		Enumeration e =v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println(v.size());
	}

}
