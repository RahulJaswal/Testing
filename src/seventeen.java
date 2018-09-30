import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
@Suppresswarning
class fswing extends JFrame implements ActionListener
{
JLabel l=null;
	fswing()
	{
		setSize(500,300);
		JButton b=new JButton("Click here");
	    l=new JLabel("Hello there!");
		b.setBounds(70, 30,120,60);
		add(b);
		l.setSize(30,30);
		add(l);
		setVisible(true);
		//b.addActionListener(this);
		b.addActionListener(new ActionListener(){   
			public void actionPerformed(ActionEvent arg)
		{
			l.setText("button pressed");
		}
			
			
		});
	}
	/*public void actionPerformed(ActionEvent arg)
	{
		l.setText("button pressed");
	}*/

}



public class seventeen {

	public static void main(String[] args)
	{
		fswing obj=new fswing();

	}

}
