package com.contact.manager.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.contact.manager.dao.ContactDaoImpl;

@WebServlet("/deleteContact")
public class DeleteContactServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        ContactDaoImpl dao = new ContactDaoImpl();
        dao.deleteContact(id);

        response.sendRedirect(request.getContextPath() + "/listContact.jsp");
    }
}

