package window;


import java.awt.*;

//import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class MainWindow extends JPanel{
	
private static JFrame frame;
private static JPanel bpanel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               createGUI();
            }
        });
	}
	public static void createGUI(){
		frame =  new JFrame("MainWindow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bpanel = new JPanel();
		
		MainWindow newContentPane =  new MainWindow();
		newContentPane.setOpaque(true);
		
		
	}
	
	public MainWindow(){
		JMenuBar bar1 =  new JMenuBar(), bar2=  new JMenuBar(), bar3 = new JMenuBar();
		
		JButton b1 = new JButton("Select File"),b2 = new JButton("Send"),b3= new JButton("Help");
		
		
		
		bar1.setBackground(new Color(248, 213, 131));
		bar1.setOpaque(true);
		bar1.setPreferredSize(new Dimension(720,20));
		bar1.add(b3);
		
		bpanel.add(b1);
		bpanel.add(b2);
		
		frame.setJMenuBar(bar1);
		
		/*frame.add(b1);
		frame.add(b2);*/
		frame.add(bpanel);
		frame.pack();
		frame.setSize(720,720);
		frame.setVisible(true);
	}

}
