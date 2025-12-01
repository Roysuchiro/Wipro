package com.contact.manager.servlet;

import com.contact.manager.dao.ContactDaoImpl;
import com.contact.manager.model.Contact;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
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

        String message;
        String messageType;

        if (name == null || name.isEmpty() || email == null || email.isEmpty() || phone == null || phone.isEmpty()) {
            message = "❌ Please fill all fields before saving the contact.";
            messageType = "error";
        } else {
            try {
                Contact contact = new Contact();
                contact.setName(name);
                contact.setEmail(email);
                contact.setPhone(phone);

                ContactDaoImpl dao = new ContactDaoImpl();
                dao.addContact(contact);

                message = "✅ Contact added successfully!";
                messageType = "success";

            } catch (Exception e) {
                message = "❌ Failed to add contact. Please try again.";
                messageType = "error";
            }
        }

        request.setAttribute("message", message);
        request.setAttribute("messageType", messageType);

        RequestDispatcher rd = request.getRequestDispatcher("listContact.jsp");
        rd.forward(request, response);
    }
}
