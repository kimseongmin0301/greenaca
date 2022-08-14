<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="post" action="/">
    <c:if test="${customer == null}">
    <table>
        <tr>
            <td>아이디</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>비번</td>
            <td><input type="text" name="pw"></td>
        </tr>
    </table>
    <input type="submit" value="로그인">
    <a href="/join"><input type="button" value="회원가입"></a>
    </c:if>
    <c:if test="${customer != null}">
        <a href="/cmDetail">회원정보수정</a>
        <a href="/logout">로그아웃</a>
    </c:if>
    <c:if test="${msg == false}">
        아이디나 비밀번호가 틀렸습니다.
    </c:if>
</form>

</body>
</html>
