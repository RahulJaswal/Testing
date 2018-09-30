import java.awt.ActiveEvent;

import javax.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class note implements ActionListener
{
	JFrame f=null;
	JMenuBar mb=null;
	JMenu jm=null;
	JMenuItem mi_new=null;
	JMenuItem mi_open=null;
	JMenuItem mi_exit=null;
	JMenuItem mi_save=null;
	JMenuItem mi_saveas=null;
	JFileChooser jfc=null;
	FileReader fin=null;
	JTextArea ta=null;
	FileWriter fout=null;
	File file=null;
	
	note()
	{
		f=new JFrame("My Notepad");
		f.setVisible(true);
		f.setSize(570,450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mi_new =new JMenuItem("New");
		mi_open=new JMenuItem("Open");
		mi_save=new JMenuItem("Save");
		mi_saveas=new JMenuItem("Save As");
		mi_exit=new JMenuItem("Exit");
		
		mb=new JMenuBar();
		
		jm=new JMenu("Menu");
		
		jm.add(mi_new);
		jm.addSeparator();
		jm.add(mi_open);
		jm.addSeparator();
		jm.add(mi_save);
		jm.addSeparator();
		jm.add(mi_saveas);
		jm.addSeparator();
		jm.add(mi_exit);
		
		ta=new JTextArea();
		f.add(ta);
		
		mb.add(jm);
		f.add(mb,BorderLayout.NORTH);
		
		
		mi_exit.addActionListener(this);
		mi_open.addActionListener(this);
		mi_new.addActionListener(this);
		mi_save.addActionListener(this);
		mi_saveas.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()== mi_open) //if open is triggered!
		{
			open();
		}
		else if (e.getSource()== mi_new) //new trigger
		{
			New();
		}
		else if(e.getSource()== mi_exit) //exit trigger
		{
			int a=JOptionPane.showConfirmDialog(f, "Save before exit!");
			if(a==JOptionPane.YES_OPTION)
			{
				save();
				System.exit(1);
			}
			else
			System.exit(1);
		}
		else if(e.getSource()== mi_save) //Save trigger
		{
			save();
		}
		else if(e.getSource() ==mi_saveas)
		{
			saveas();
		}
	}
	public void open()
	{
		jfc =new JFileChooser();
	
		int returnval=jfc.showOpenDialog(f);
		
		if(returnval==JFileChooser.APPROVE_OPTION)
		{
			try 
			{
				file=jfc.getSelectedFile();
				fin=new FileReader(file);
			}
			catch (FileNotFoundException e1) 
			{
				e1.printStackTrace();
			}
			
			int a;
			ta.setText(null);  //to ensure that no text is already written in ta
			try {
				while((a=fin.read())!=-1)
				{
					ta.append((char)a+"");
					
				}
				fin.close();
			} 
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
		}
		
	}
	public void New()
	{
		ta=new JTextArea();
		f.add(ta);
	}
	public void save()
	{
		try 
		{
			fout =new FileWriter(file);
			fout.write(ta.getText());
			fout.close();	
		}
		catch (IOException e1) 
		{	
			e1.printStackTrace();
		}
	}
	public void saveas() 
	{
		jfc=new JFileChooser();
		jfc.setApproveButtonText("Save");
		int returnval=jfc.showOpenDialog(f);
		if(returnval==JFileChooser.APPROVE_OPTION)
		{
			try {
				fout=new FileWriter(jfc.getSelectedFile() +".txt");
				fout.write(ta.getText());
				fout.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
		}
	}
}

public class twenty {

	public static void main(String[] args) 
	{
		note obj=new note();
	}

}