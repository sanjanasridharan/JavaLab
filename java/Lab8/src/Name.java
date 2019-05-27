import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.*;
import java.io.IOException;
import javax.servlet.http.*;
@WebServlet("/Name")
public class Name extends HttpServlet {

	private static final long SerialVersionUID=1L;
	
	String url="jdbc:mysql://localhost:3306/OnlineDirectory";
	String uname="root";
	String password="dass2017";
	public Name()
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
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String name=request.getParameter("name");
		String query="select * from Telephone_Directory where Name ='"+name+"'";
		try
		{
			Connection con=DriverManager.getConnection(url,uname,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.isBeforeFirst())
			{
				while(rs.next())
				{
				response.getWriter()
				        .append("phone no: "+rs.getInt(1)+"\n")
				        .append("Name: "+rs.getString(2)+"\n")
				        .append("Address: "+rs.getString(3)+"\n")
				        .append("Company: "+rs.getString(4)+"\n")
				        .append("pin: "+rs.getInt(5)+"\n");
				
				       
			}
			}
			else
				response.getWriter().append("No matching records");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		doGet(request,response);
	}
}













