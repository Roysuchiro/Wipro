package com.contact.manager.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.contact.manager.dao.*;
import com.contact.manager.model.Contact;

@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Contact c = new Contact();
        c.setName(name);
        c.setEmail(email);
        c.setPhone(phone);

        new ContactDaoImpl().addContact(c);
        response.sendRedirect("listContact.jsp");
    }
}
