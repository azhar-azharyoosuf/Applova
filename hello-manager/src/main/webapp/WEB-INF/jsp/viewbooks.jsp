<%--
  Created by IntelliJ IDEA.
  User: azhar
  Date: 12/07/2023
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books List</title>
</head>
<body>
<h1>Books List</h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Author</th>
        <th>Year</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="book" items="${bookList}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.year}</td>
            <td><a href="editbook/${book.id}">Edit</a></td>
            <td><a href="deletebook/${book.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="bookform">Add New Book</a>
</body>
</html>

