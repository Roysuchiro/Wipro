<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.contact.manager.dao.ContactDaoImpl"%>
<%@page import="com.contact.manager.model.Contact"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-4">
    <h2 class="text-center mb-4">📇 My Contacts</h2>

    <%-- ✅ Message Display Section --%>
    <%
        String message = (String) request.getAttribute("message");
        String messageType = (String) request.getAttribute("messageType");

        if (message != null) {
            String alertClass = "success".equals(messageType) ? "alert-success" : "alert-danger";
    %>
        <div class="alert <%=alertClass%> text-center" role="alert">
            <%=message%>
        </div>
    <%
        }
    %>

    <div class="d-flex justify-content-end mb-3">
        <a href="addContact.jsp" class="btn btn-primary">
            <i class="bi bi-person-plus"></i> Add Contact
        </a>
    </div>

    <table class="table table-bordered table-striped table-hover shadow-sm">
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
            ContactDaoImpl dao = new ContactDaoImpl();
            List<Contact> list = dao.getAllContacts();

            if (list.isEmpty()) {
        %>
            <tr><td colspan="5" class="text-center text-muted">No contacts found</td></tr>
        <%
            } else {
                for (Contact c : list) {
        %>
            <tr>
                <td><%=c.getId()%></td>
                <td><%=c.getName()%></td>
                <td><%=c.getEmail()%></td>
                <td><%=c.getPhone()%></td>
                <td>
                    <a href="editContact.jsp?id=<%=c.getId()%>" class="btn btn-sm btn-warning">
                        <i class="bi bi-pencil"></i> Edit
                    </a>
                    <a href="deleteContact?id=<%=c.getId()%>" class="btn btn-sm btn-danger" onclick="return confirm('Are you sure?');">
                        <i class="bi bi-trash"></i> Delete
                    </a>
                </td>
            </tr>
        <%
                }
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>


    