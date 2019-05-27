import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Progress {
	
	public static void main(String[] args)
	{
		
		 JFrame jf=new JFrame();
		 JLabel jl1=new JLabel("Source file:");
		 JLabel jl2=new JLabel("Dest file:");
		 JTextField tx1=new JTextField(20);
		 JTextField tx2=new JTextField(20);
		 JButton b1=new JButton("start");
		 JButton b2=new JButton("stop");
		 JTextArea ta=new JTextArea(10,10);
		 jf.add(jl1);
		 jf.add(tx1);
		 jf.add(jl2);
		 jf.add(tx2);
		 jf.add(b1);
		 jf.add(ta);
		 jf.setSize(800,800);
		 jf.setLayout(new FlowLayout());
		 jf.setVisible(true);
		 JProgressBar jp=new JProgressBar(0,100);
		 b1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 
				 String src=tx1.getText();
				 String dest=tx2.getText();
				 jp.setIndeterminate(true);
				 jp.setString("Copying");
				 jp.setStringPainted(true);
				 jp.setVisible(true);
				 try
				 {
					 jf.add(jp);
					 jf.add(b2);
					 jf.setVisible(true);
					 String content=new String(Files.readAllBytes(Paths.get(src)));
					 PrintWriter op=new PrintWriter(dest);
					 op.println(content);
					 op.close();
				 }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				 
			 }
		 });
		 
		 b2.addActionListener(new ActionListener() {
			 
			 
			 public void actionPerformed(ActionEvent e)
			 {
				 String src=tx2.getText();
				 b1.setEnabled(false);
				 b2.setEnabled(false);
				 jp.setVisible(false);
				 try
				 {
					 String content=new String(Files.readAllBytes(Paths.get(src)));
					
					 ta.setText(content);
					 
				 }
				 
				 catch(Exception ae)
				 {
					 ae.printStackTrace();
				 }
				 
				 }	 
			 
			 });
		 jf.setVisible(true);
		 jf.setSize(800,800);
		 jf.setLayout(new FlowLayout());
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}

}
