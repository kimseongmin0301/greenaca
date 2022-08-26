<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <%--    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="../../../resources/JS/reply.js"></script>
    <script src="resources/JS/attach.js" type="text/javascript"></script>
</head>
<body>
<div id="container">
    <div id="content">
        <form method="post" action="/boardModify">
            <table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
                <thead>
                <tr>
                    <td><input type="text" class="form-control" name="title"
                               maxlength="50" style="width:443px;" value="${detail.title}">
                    </td>
                    <td><input type="text" name="bno" value="${detail.bno}" id="bno" hidden>
                    </td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td><textarea style="resize : none;" class="form-control"
                                  name="content" maxlength="2048" rows="20" cols="60">${detail.content}</textarea></td>
                </tr>
                </tbody>
            </table>
            <div>
                <ul id="upload_img">

                </ul>
            </div>

            <div class="board_btn">
                <a href="/bread"><input type="button" value="목록"></a>
                <input type="submit" value="수정"></a>
                <input type="submit" value="삭제" formaction="/boardRemove">
            </div>
        </form>
        <div>
            <div>
                <label>댓글</label>
            </div>

            <textarea style="resize : none;" rows="5" cols="50" id="reply" name="area"></textarea>
            <%--            <input type="text" id="reply">--%>
        </div>
        <div>
            <input type="button" value="댓글쓰기" id="add">
        </div>
        <div id="chat">
            <div id="replyUL">
            </div>
        </div>
        <div id="paging"></div>
    </div>
</div>
</body>
</html>
