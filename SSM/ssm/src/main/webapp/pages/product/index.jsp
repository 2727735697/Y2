<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/26
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>水果产品详情页面</title>
</head>
<body>
<h2>水果信息表</h2>
<table>
    <thead>
    <tr>
        <th>水果编号</th>
        <th>水果名称</th>
        <th>水果价格</th>
        <th>水果详情</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.list}" var="obj">
        <tr>
            <td>${obj.id}</td>
            <td>${obj.name}</td>
            <td>${obj.price}</td>
            <td>${obj.introduce}</td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="3">
            <a href="/product/query/page/${page.firstPage}/5">首页</a>
            <a href="/product/query/page/${page.prePage}/5">上一页</a>
            <a href="/product/query/page/${page.nextPage}/5">下一页</a>
            <a href="/product/query/page/${page.lastPage}/5">尾页</a>
            第${page.pageNum}页 共${page.pages}页
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
