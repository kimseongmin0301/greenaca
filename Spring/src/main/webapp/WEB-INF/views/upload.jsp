<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="uploadFormAction" method="post" enctype="multipart/form-data">
    <input type="file" name="multipartFile" multiple>
    <input type="submit" value="파일전송">
</form>

</body>
</html>
