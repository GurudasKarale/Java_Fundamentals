package com.firstServletPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class basicServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i =Integer.parseInt(req.getParameter("firstnumber"));
		int j =Integer.parseInt(req.getParameter("secondnumber"));
		
		PrintWriter out=res.getWriter();
		out.println(i+j);
			
	}

}
