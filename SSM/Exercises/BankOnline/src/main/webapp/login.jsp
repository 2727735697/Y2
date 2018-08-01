<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/1
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人网上银行-登录</title>
    <script src="${ctx}/static/js/jquery.js" type="text/javascript"></script>
</head>
<body style="text-align: center">

<form action="${ctx}/account/login" method="post">
    <div>
        <h2>个人网上银行</h2>
        <p>卡号：<input type="text" name="cardNo" value="${account.cardNo}"></p>
        <p>密码：<input type="password" name="password" value="${account.password}"></p>
        <p><input type="button" id="submitBtn" value="登录网上银行"></p>
    </div>
</form>

<%--给form表单的登录按钮添加点击事件--%>
<script>
    $(function () {
        var errMsg = '${errMsg}';

        if (errMsg !== '' && errMsg !== null) {
            alert(errMsg);
        }
        errMsg = null;

        $('#submitBtn').click(function () {
            var cardNo = $('input[name=cardNo]').val();
            if (cardNo.length != 16) {
                alert("请输入16位卡号！");
                return;
            }
            var password = $('input[name=password]').val();
            if (password.length != 6) {
                alert("请输入6位数字密码");
                return;
            }
            $('form').submit();
        })
    })
</script>

</body>
</html>
