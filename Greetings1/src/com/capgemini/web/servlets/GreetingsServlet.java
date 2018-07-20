package com.capgemini.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GreetingsServlet")
public class GreetingsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public GreetingsServlet()
    {
        super();
    }
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	PrintWriter out = response.getWriter();
    	
    	out.println("<h1>Hello World</h1>");
    	
    	for (int count = 0; count < 10; count++) 
    	{
    		out.print("<div style='background-color: pink'>Div tag</div>");
		}
    	out.println("<br/>Date:"+ new Date());
	}
	
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
