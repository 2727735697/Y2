<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/25
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多种form表单提交数据方法</title>
</head>
<body>

<form action="/user/info" method="post">
    姓名: <input type="text" name="name"><br>
    年龄： <input type="text" name="age"><br>
    出生日期： <input type="text" name="birth"><br>
    <input type="submit" value="传统提交">
</form>
<hr>
<form action="/user/info2" method="post">
    姓名: <input type="text" name="name"><br>
    年龄： <input type="text" name="age"><br>
    出生日期： <input type="text" name="birth"><br>
    <input type="submit" value="基于两三个表单的提交">
</form>
<hr>
<form action="/user/info3" method="post">
    姓名: <input type="text" name="name"><br>
    年龄： <input type="text" name="age"><br>
    <%--出生日期： <input type="text" name="birth"><br>--%>
    <input type="submit" value="基于springmvcform以javabean提交">
</form>
<hr>
<form action="/upload/file" method="post" enctype="multipart/form-data">
    文件： <input type="file" name="file"> <br>
    姓名： <input type="text" name="username"> <br>
    <input type="submit" value="上传">
</form>

</body>
</html>
