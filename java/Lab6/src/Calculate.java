import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

@WebServlet("/Calculate.java")
public class Calculate extends 	HttpServlet
{  private static final long serialVersionUID= 1L; 
	
	public Calculate() {
		
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String name =request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String gender=request.getParameter("gender");
		double deduction=Double.parseDouble(request.getParameter("deduction"));
		double incomeTax=(salary-deduction)*0.2;
		
		
		response.getWriter()
		   .append("Name: "+name+"\n")
		   .append("Salary: "+salary+"\n")
		   .append("Gender: "+gender+"\n")
		  .append("Deduction: "+deduction+"\n")
		  .append("Income Tax: "+incomeTax+"\n");
		
		
		String file= new File("tax.txt").getAbsolutePath();
		System.out.println("File:" + file);
		PrintWriter p=new PrintWriter("tax.txt");
		p.println("Name: "+name+"\n");
		p.println("Salary: "+salary+"\n");
		p.println("Gender: "+gender+"\n");
		p.println("Deduction: "+deduction+"\n");
		p.println("Income Tax: "+incomeTax+"\n");
		p.close();
		
	}
   protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		doGet(request,response);
	}

}
