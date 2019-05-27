import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.http.*;
@WebServlet("/Number.java")
public class Number extends HttpServlet {
	
	private static final long SerialVersionUID=1L;
	
	 String url="jdbc:mysql://localhost:3306/More8";
	 String uname="root";
	 String pass="dass2017";
	
	  public Number()
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
			 
			  long ph=Long.parseLong(request.getParameter("number"));
			  try
			  {
			
				  Connection con=DriverManager.getConnection(url,uname,pass);
				  Statement st=con.createStatement();
				  String query="select * from Telephone where Phone = "+ph+"";
				  ResultSet rs=st.executeQuery(query);
				  
					   if(rs.isBeforeFirst())
					   {
						   while(rs.next())
						   {
							   response.getWriter()
							   .append("Number: "+rs.getInt(1))
							   .append("Name: "+rs.getString(2))
							   .append("address: "+rs.getString(3))
							   .append("company: "+rs.getString(4));

						   }
					   }
					   
					   else
					   {
						   response.getWriter().append("number not found");
					   }
			      
			    }
			  catch(SQLException e)
			  {
				  e.printStackTrace();
			  }
		  }
		  
		  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
		  {
			doGet(request,response);  
		  }
	  }


