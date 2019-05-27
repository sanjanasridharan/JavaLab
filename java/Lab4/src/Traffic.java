import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Traffic extends JFrame
{
	public static void main(String[] args)
	{
		JFrame jf = new JFrame();
		JPanel jp=new JPanel();
		JRadioButton r1=new JRadioButton("RED");
		JRadioButton r2=new JRadioButton("YELLOW");
		JRadioButton r3=new JRadioButton("GREEN");
		JTextField jt = new JTextField(20);
		
		r1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg)
			{
				jt.setText("stop");
				jt.setBackground(Color.RED);
			}
		});
		
		r2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg)
			{
				jt.setText("ready");
				jf.setBackground(Color.YELLOW);
			}
		});
		
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg)
			{
				jt.setText("GO");
				jt.setBackground(Color.GREEN);
			}
		});
		
		
		jf.add(jt);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		jf.add(r1);
		jf.add(r2);
		jf.add(r3);
		
		jf.setVisible(true);
		jf.setSize(400,400);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
			
	}

}
