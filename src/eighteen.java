//implementing MouseListner interface
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class fswing1 implements MouseListener
{
	JLabel l=null;
	fswing1()
	{
		
		JFrame f=new JFrame();
		f.setSize(500,300);
		JButton b=new JButton("Click here");
		//l=new JLabel();
		 l=new JLabel();
		b.setBounds(70, 30,120,60);
		f.add(b);
		l.setSize(30,30);
		f.add(l);
		f.setVisible(true);
		
		b.addMouseListener(this);
			
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	};
	}

	
	
public class eighteen {

	public static void main(String[] args)
	{
		fswing1 f=new fswing1();

	}

}
