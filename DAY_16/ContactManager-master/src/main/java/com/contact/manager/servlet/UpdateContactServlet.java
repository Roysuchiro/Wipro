package com.contact.manager.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contact.manager.dao.ContactDaoImpl;
import com.contact.manager.model.Contact;

/**
 * Servlet implementation class UpdateContactServlet
 */
@WebServlet("/updateContact")
public class UpdateContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
        contact.setId(Integer.parseInt(req.getParameter("id")));
        contact.setName(req.getParameter("name"));
        contact.setEmail(req.getParameter("email"));
        contact.setPhone(req.getParameter("phone"));

        new ContactDaoImpl().updateContact(contact);
        res.sendRedirect("listContacts");
	}

}
