<%--
  Created by IntelliJ IDEA.
  User: azhar
  Date: 12/07/2023
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Book</title>
</head>
<body>
<h1>Edit Book</h1>
<form action="/updatebook" method="post">
    <input type="hidden" name="id" value="${book.id}"/>
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" value="${book.title}" required/><br/><br/>
    <label for="author">Author:</label>
    <input type="text" id="author" name="author" value="${book.author}" required/><br/><br/>
    <label for="year">Year:</label>
    <input type="number" id="year" name="year" value="${book.year}" required/><br/><br/>
    <input type="submit" value="Update Book"/>
</form>
</body>
</html>
