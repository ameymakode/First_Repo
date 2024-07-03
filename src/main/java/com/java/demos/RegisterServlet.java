
package com.java.demos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.User;

import com.java.dao.UserDao;
import com.java.dao.UserDaoImp;
import com.java.dao.user;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private static UserDao userdao = new UserDaoImp();
  
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

       user us = new user ();
       us.setUsername(username);
       us.setEmail(email);
       us.setPassword(password);
       
     
	
	//UserDao userDao = new UserDaoImpl();
       if (userdao.addUser(us)) {
    	   System.out.println("jb");
           response.sendRedirect("login.jsp?registration=success");
       } else {
    	   System.out.println("dfdvqe");
           response.sendRedirect("register.jsp?error=1");
       }
       
       
       
       
	}

}





