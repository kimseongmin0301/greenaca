<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/Modify">
    <table>
        <tr>
            <td>아디</td>
            <td><input type="text" name="id" value="${lg.id}" readonly></td>
        </tr>
        <tr>
            <td>비번</td>
            <td><input type="text" name="pw" value="${lg.pw}"></td>
        </tr>
    </table>
    <input type="submit" value="수정">
</form>
</body>
</html>
