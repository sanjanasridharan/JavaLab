import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;
public class MainProg {
	
	public static void main(String[] args) throws Exception
	{   JFrame jf=new JFrame();
		JLabel jl1,jl2,jl3,jl4,jll1,jll2,jll3,jll4,jll5;
		JTextField jf1,jf2,jf3,jf4,jff1,jff2,jff3,jff4,jff5;
		JTextArea ta=new JTextArea(40,40);
		JButton b1,b2,b3;
		jl1=new JLabel("RepNo:");
		jl2=new JLabel("RepName:");
		jl3=new JLabel("State:");
		jl4=new JLabel("Commision rate:");
		jll1=new JLabel("CustNo:");
		jll2=new JLabel("CustName:");
		jll3=new JLabel("State:");
		jll4=new JLabel("CreditLimit:");
		jll5=new JLabel("RepNo:");
		jf1=new JTextField(10);
		jf2=new JTextField(10);
		jf3=new JTextField(10);
		jf4=new JTextField(10);
		jff1=new JTextField(10);
		jff2=new JTextField(10);
		jff3=new JTextField(10);
		jff4=new JTextField(10);
		jff5=new JTextField(10);
		b1=new JButton("INSERT");
		b2=new JButton("INSERT");
		b3=new JButton("SHOW");
		jf.add(jl1);
		jf.add(jf1);
		jf.add(jl2);
		jf.add(jf2);
		jf.add(jl3);
		jf.add(jf3);
		jf.add(jl4);
		jf.add(jf4);
		jf.add(b1);
		jf.add(jll1);
		jf.add(jff1);
		jf.add(jll2);
		jf.add(jff2);
		jf.add(jll3);
		jf.add(jff3);
		jf.add(jll4);
		jf.add(jff4);
		jf.add(jll5);
		jf.add(jff5);
		jf.add(b2);
		jf.add(b3);
		jf.add(ta);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae)
			{
			
				
				int RepNo=Integer.parseInt(jf1.getText());
				String RepName=jf2.getText();
				String State=jf3.getText();
				int Comission_Rate=Integer.parseInt(jf4.getText());
				String url="jdbc:mysql://localhost:3306/Lab3";
				String uname="root";
				String password="dass2017";
				String query="insert into Representative values("+RepNo+",'"+RepName+"','"+State+"',"+Comission_Rate+")";
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=(Connection)DriverManager.getConnection(url,uname,password);
					if(con!=null)
					{Statement st=(Statement)con.createStatement();
					st.executeUpdate(query);
				}
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
				int CustNo = Integer.parseInt(jff1.getText());
				String CustName = jff2.getText();
				String State = jff3.getText();
				int Credit_Limit=Integer.parseInt(jff4.getText());
				int RepNo=Integer.parseInt(jff5.getText());
				
				
				String url="jdbc:mysql://localhost:3306/Lab3";
				String uname="root";
				String password="dass2017";
				String query="insert into Customer values("+CustNo+",'"+CustName+"','"+State+"',"+Credit_Limit+","+RepNo+")";
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,password);
					Statement st=con.createStatement();
					st.executeUpdate(query);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
						
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg)
			{
				String url="jdbc:mysql://localhost:3306/Lab3";
				String uname="root";
				String password="dass2017";
				String query="select * from Representative where RepNo in (select RepNo from Customer where Credit_Limit>1500)";
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,uname,password);
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					  ta.setText("");
					  String s=" ";
					  while(rs.next())
					  {
						  s+=rs.getInt(1)+" ";
						  s+=rs.getString(2)+" ";
						  s+=rs.getString(3)+" ";
						  s+=rs.getString(4)+" ";
						  s+="\n";
					  }
					  ta.append(s);
		           
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
