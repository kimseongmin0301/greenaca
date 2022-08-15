<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/join" id="userForm">
<table>
    <tr>
        <td>아디</td>
        <td><input type="text" id="txtid" name="id">
        <td><button type="button" id="idCheck" onclick="id_check()" value="N">중복체크</button></td>
        <td><span id="idchk"></span></td>
    </tr>
    <tr>
        <td>비번</td>
        <td><input type="text" name="pw"></td>
    </tr>
</table>
    <input type="submit" value="가입">
</form>
<script>
    function id_check(){
        $.ajax({
            url:"idCheck",
            type:"post",
            dataType : "json",
            data : $("#txtid").serialize(),
            cache:false,
            success:function (data){
                if(data == 1){
                    $("#idchk").text("중복입니다.");
                }else if(data == 0){
                    $("#idchk").text("허용됨");
                }
            }
        })
    }
</script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</body>
</html>
