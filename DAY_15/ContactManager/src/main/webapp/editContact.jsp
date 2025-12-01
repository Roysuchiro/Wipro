<%@ page import="com.contact.manager.dao.ContactDaoImpl" %>
<%@ page import="com.contact.manager.model.Contact" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Contact</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<%
    int id = Integer.parseInt(request.getParameter("id"));
    ContactDaoImpl dao = new ContactDaoImpl();
    Contact contact = dao.getContactById(id);
%>

<div class="container mt-5">
    <div class="card shadow-lg border-0">
        <div class="card-header bg-warning text-dark text-center">
            <h3>Edit Contact</h3>
        </div>
        <div class="card-body">
            <form action="editContact" method="post">
                <input type="hidden" name="id" value="<%= contact.getId() %>">

                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" name="name" value="<%= contact.getName() %>" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" name="email" value="<%= contact.getEmail() %>" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Phone</label>
                    <input type="text" name="phone" value="<%= contact.getPhone() %>" class="form-control" required>
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-success">Update Contact</button>
                    <a href="listContact.jsp" class="btn btn-secondary">Cancel</a>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
