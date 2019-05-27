import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.*;
public class Traffic 
{
public static void main(String[] args)
{
	JFrame jf= new JFrame();
	JRadioButton b1=new JRadioButton("RED");
	JRadioButton b2=new JRadioButton("YELLOW");
	JRadioButton b3=new JRadioButton("GREEN");
	JTextField txt=new JTextField(20);
	jf.add(txt);
	ButtonGroup bg=new ButtonGroup();
	bg.add(b1);
	bg.add(b2);
	bg.add(b3);
	jf.add(b1);
	jf.add(b2);
	jf.add(b3);
	
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			txt.setBackground(Color.RED);
			txt.setText("STOP");
			
		}
		
   
		
	});
	
	b2.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae)
		   {
			   txt.setBackground(Color.YELLOW);
				txt.setText("READY");
				
		   }
	   });
	b3.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae)
		   {
			   txt.setBackground(Color.GREEN);
				txt.setText("GO");
				
		   }
	   });
	
	
	jf.setVisible(true);
	jf.setSize(400,400);
	jf.setLayout(new FlowLayout());
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	
}
	
	
}
