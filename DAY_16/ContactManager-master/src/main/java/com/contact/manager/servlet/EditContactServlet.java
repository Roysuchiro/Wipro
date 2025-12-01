package com.contact.manager.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.contact.manager.dao.ContactDaoImpl;
import com.contact.manager.model.Contact;

@WebServlet("/editContact")
public class EditContactServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Contact contact = new Contact(id, name, email, phone);
        ContactDaoImpl dao = new ContactDaoImpl();
        dao.updateContact(contact);

        response.sendRedirect(request.getContextPath() + "/listContact.jsp");
    }
}
