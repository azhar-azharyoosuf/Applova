<%--
  Created by IntelliJ IDEA.
  User: azhar
  Date: 12/07/2023
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Book Form</title>
</head>
<body>
<h2>Book Form</h2>
<form action="/savebook" method="post">
    <table>
        <tr>
            <td>Title:</td>
            <td><input type="text" name="title" value="${book.title}" /></td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><input type="text" name="author" value="${book.author}" /></td>
        </tr>
        <tr>
            <td>Year:</td>
            <td><input type="text" name="year" value="${book.year}" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save Book" /></td>
        </tr>
    </table>
</form>
</body>
</html>