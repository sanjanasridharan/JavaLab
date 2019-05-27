import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import javax.servlet.ServletException;

@WebServlet("/CalculateTax")
public class CalculateTax extends HttpServlet
{
   private static final long b=1L;
   
   public CalculateTax()
   {
	   
   }
   protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {   String file= new File("tax.txt").getAbsolutePath();
	System.out.println("File:" + file);
	   PrintWriter pw=new PrintWriter("paste.txt");
	   String name=request.getParameter("name");
	   String gender=request.getParameter("gender");
	   int salary=Integer.parseInt(request.getParameter("salary"));
	   int deduction=Integer.parseInt(request.getParameter("deduction"));
	   double tax=(salary-deduction)*0.2;
	   
	   pw.println("Name: "+name);
	   pw.println("Gender: "+gender);
	   pw.println("Salary: "+salary);
	   pw.println("Deduction: "+deduction);
	   pw.println("Income Tax: "+tax);
	   pw.close();
		  PrintWriter p=response.getWriter()
				               .append("Name: "+name+"\n")
				               .append("Gender: "+gender+"\n")
				               .append("Salary: "+salary+"\n")
				               .append("Deduction: "+deduction+"\n")
				               .append("Income Tax: "+tax+"\n");
				     		  	   
   }
   protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {
	   doGet(request,response);
   }
   
}
