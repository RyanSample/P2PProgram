package window;

import java.io.File;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//reference: http://docs.oracle.com/javase/tutorial/uiswing/examples/components/FileChooserDemoProject/src/components/FileChooserDemo.java
//class to implement a gui for a file selector
@SuppressWarnings("serial")
public class FileSelector extends JPanel implements ActionListener{
	JButton openB;
	JTextArea log;
	JFileChooser fc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//constructor
	FileSelector(){
		super(new BorderLayout());
		 log = new JTextArea(5,20);
	     log.setMargin(new Insets(5,5,5,5));
	     log.setEditable(false);
	     JScrollPane logScrollPane = new JScrollPane(log);
	     
	     fc =  new JFileChooser();
	     
	     fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	     openB = new JButton("Open File");
	     openB.addActionListener(this);
	     
	     JPanel buttonp =  new JPanel();
	     buttonp.add(openB);
	     add(buttonp,BorderLayout.PAGE_START);
	     add(logScrollPane,BorderLayout.CENTER);
	}
	//returns the file from the file selector
	public File getFile(){
		File file;
		file = null;
		return file;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
	}

}
