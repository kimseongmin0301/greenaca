<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/CSS/BoardList_CSS/BoardWrite.css" type="text/css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="resources/JS/upload.js" type="text/javascript"></script>
</head>
<body>
<div id="wrap">
    <div id="container">
        <div id="content">
            <form method="post" action="/boardWrite" accept-charset="UTF-8" id="form">
                <table class="b">
                    <thead>
                    <tr>
                        <th>게시판 글쓰기 양식</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="text" class="b_title" placeholder="글 제목" maxlength="50" name="title">
                        </td>
                    </tr>
                    <%--                <tr>--%>
                    <%--                    <td><input type="text" class="form-control" placeholder="주소" name="map" maxlength="50"></td>--%>
                    <%--                </tr>--%>
                    <tr>
                        <td><textarea class="b_text" placeholder="글 내용"
                                      maxlength="2048" name="content"></textarea></td>
                    </tr>
                    <tr>
                        <td id="b_file">    <input type="file" name="multipartFile" multiple id="upload">
                        </td>
                    </tr>
                    </tbody>
                </table>
                <div>
                    <ul id="upload_img">
                    </ul>
                </div>
                <div id="abc">
                    <button type="button" class="btn_write" id="uploadBtn">글쓰기</button>
                    <a href="http://localhost:8080/bread"><button type="button" class="btn_write btn_cancel">취소</button></a>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
