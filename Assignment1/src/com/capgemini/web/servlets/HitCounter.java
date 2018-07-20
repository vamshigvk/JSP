package com.capgemini.web.servlets;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HitCounter")
public class HitCounter extends HttpServlet
{
	int visitorCount=0;
	
	@Override
	public void init() throws ServletException 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("D:\\G_VamshiKrishna-141\\Module 2 - SQL - pl-sql\\Servlet and JSP\\count.txt");
			visitorCount=fis.read();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>my page daa</title>");
		out.println("<body>");
		out.println("<h1>welcome to our website</h1>");
		out.println("<hr/>");
		out.println("<br/>");
		out.println("you are visitor number<b>"+ ++visitorCount+"</b>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
	@Override
	public void destroy() 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("D:\\G_VamshiKrishna-141\\Module 2 - SQL - pl-sql\\Servlet and JSP\\count.txt");
			fos.write(visitorCount);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}