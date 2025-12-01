<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.contact.manager.dao.ContactDaoImpl" %>
<%@ page import="com.contact.manager.model.Contact" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Contacts</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg border-0">
        <div class="card-header bg-primary text-white text-center">
            <h3>📞 Contact Manager</h3>
        </div>
        <div class="card-body">
            <%
                ContactDaoImpl dao = new ContactDaoImpl();
                List<Contact> contacts = dao.getAllContacts();
            %>

            <table class="table table-striped table-hover text-center align-middle">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    for (Contact c : contacts) {
                %>
                    <tr>
                        <td><%= c.getId() %></td>
                        <td><%= c.getName() %></td>
                        <td><%= c.getEmail() %></td>
                        <td><%= c.getPhone() %></td>
                        <td>
                            <a href="editContact.jsp?id=<%= c.getId() %>" class="btn btn-sm btn-warning">✏️ Edit</a>
                            <a href="deleteContact?id=<%= c.getId() %>" class="btn btn-sm btn-danger"
                               onclick="return confirm('Are you sure you want to delete this contact?');">🗑️ Delete</a>
                        </td>
                    </tr>
                <%
                    }
                %>
                </tbody>
            </table>

            <div class="text-end mt-3">
                <a href="addContact.jsp" class="btn btn-success">➕ Add New Contact</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>



    