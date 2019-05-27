import java.sql.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.*;
import java.io.IOException;
import javax.servlet.http.*;
@WebServlet("/Tshirt.java")
public class Tshirt extends HttpServlet{
	
	private static final long SerialVersionUID=1L;
	
	String url="jdbc:mysql://localhost:3306/More7";
	String uname="root";
	String password="dass2017";
	public Tshirt()
	{
		super();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException
	{
		
		
		String a[]=request.getParameterValues("acc");
		String acc="";
		for(String s:a)
		{
			acc=acc+ s +" ";
		}
		String tag=request.getParameter("tag");
		String poc=request.getParameter("poc");
		String color=request.getParameter("color");
		String query="select * from Tshirt";
		try {
			
			Connection con=DriverManager.getConnection(url,uname,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(!rs.isBeforeFirst())
			{
				int ono=100;
				String q="insert into Tshirt values("+ono+",'"+acc+"','"+tag+"','"+poc+"','"+color+"');";
				st.executeUpdate(q);
			}
			rs.afterLast();
			if(rs.previous())
			{
				int on=rs.getInt(1);
				on=on+1;
				String q="insert into Tshirt values("+on+",'"+acc+"','"+tag+"','"+poc+"','"+color+"');";
				st.executeUpdate(q);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		response.sendRedirect("doing.jsp");
		
		
	}
	
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException
	{
	   doGet(request,response);
	}

}





















