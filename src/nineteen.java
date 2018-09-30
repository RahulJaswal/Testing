//use of keylistner and mouse adapter

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
class fswing22 implements KeyListener
{
	JFrame f=null;
	JLabel lb=null;
	fswing22()
	{
		f=new JFrame();
		f.setSize(500,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea l=new JTextArea();
		
		f.add(l);
		l.setBounds(30,40,70,70);
		
		lb=new JLabel("Welcome!");
		
		f.add(lb);
		
		l.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lb.setText(e.getKeyChar()+"");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
/*
class fswing2 extends MouseAdapter
{
	fswing2()
	{
	JFrame f=new JFrame();
	f.setSize(500,300);
	f.setVisible(true);
	JButton b=new JButton("Click here");
	 JLabel l=new JLabel();
	b.setBounds(70, 30,120,60);
	f.add(b);
	
	f.add(l);
	l.setSize(30,30);
	b.addMouseListener(this);
	}
	
	
	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("Mouse pressed!");
	}
	
}*/


public class nineteen {

	public static void main(String[] args)
	{
		
	//	fswing2 obj=new fswing2();
		fswing22 obj1=new fswing22();
	}

}
