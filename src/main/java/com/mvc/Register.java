package com.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name = 	request.getParameter("username");
	String city = 	request.getParameter("city");
	String email = 	request.getParameter("email");
	String password = 	request.getParameter("password");
	
	
	
	Model model=new Model();
	model.setUsername(name);
	model.setCity(city);
	model.setEmail(email);
	model.setPassword(password);
	
	int rowaff =model.register();
	System.out.println(rowaff);
	
	HttpSession session = request.getSession();
	session.setAttribute("name", name);
	
	if(rowaff==0) {
	    
		response.sendRedirect("/RegistrationAppMVC/failure.jsp");
		
	  }else {
		  response.sendRedirect("/RegistrationAppMVC/success.jsp");
		  
	  }
	
	
		
		
	}

}
