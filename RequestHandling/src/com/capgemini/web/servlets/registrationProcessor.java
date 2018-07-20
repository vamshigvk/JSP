package com.capgemini.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registrationProcessor")
public class registrationProcessor extends HttpServlet
{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name= request.getParameter("name");
		String password = request.getParameter("password");
		String email= request.getParameter("email");
		String country= request.getParameter("country");
		String gender= request.getParameter("gender");
		String[] hobbies= request.getParameterValues("hobbies");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("Client details are");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr><td>name</td>");
		out.println("<td>"+name+"</td></tr>");
		out.println("<tr><td>email</td>");
		out.println("<td>"+ email +"</td></tr>");
		out.println("<tr><td>gender</td>");
		out.println("<td>"+gender+"</td></tr>");
		out.println("<tr><td>Country</td>");
		out.println("<td>"+country+"</td></tr>");
		out.println("<tr><td>Hobbies</td>");

		String hobbyList="";
		for (String hobby : hobbies) {
			hobbyList+=hobby+",";
		}

		out.println("<td>"+ hobbyList+"</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
