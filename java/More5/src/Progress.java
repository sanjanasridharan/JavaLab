import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.*;
public class Progress
{
  public static void main(String[] args)
  {
	  JFrame jf=new JFrame();
	  JLabel jl1=new JLabel("Source:");
	  JLabel jl2=new JLabel("Dest:");
	  JTextField tx1=new JTextField(20);
	  JTextField tx2=new JTextField(20);
	  JTextArea ta=new JTextArea(50,50);
	  JButton b1=new JButton("START");
	  JButton b2=new JButton("STOP");
	  jf.add(jl1);
	  jf.add(tx1);
	  
	  jf.add(jl2);
	  jf.add(tx2);
	  jf.add(ta);
	  jf.add(b1);
	  jf.setVisible(true);
	  jf.setSize(600,600);
	  JProgressBar jp=new JProgressBar(0,100);
	  b1.addActionListener(new ActionListener(){
		  
		  public void actionPerformed(ActionEvent ae)
		  {
			  String src=tx1.getText();
			  String dest=tx2.getText();
			  jp.setIndeterminate(true);
			  jp.setStringPainted(true);
			  jp.setString("Copying");
			  jp.setVisible(true);
			  try {
				     jf.add(b2);
				     jf.add(jp);
				     jf.setVisible(true);
				     String content=new String(Files.readAllBytes(Paths.get(src)));
				     PrintWriter pw=new PrintWriter(dest);
				     pw.println(content);
				     pw.close();
				     
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
		  }
	  });
	  
	  
	  
	  b2.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent ae)
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
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
		  }
	  });
	  
	  jf.setVisible(true);
	  jf.setSize(600,600);
	  jf.setLayout(new FlowLayout());
	  jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
  }
	
	
}
