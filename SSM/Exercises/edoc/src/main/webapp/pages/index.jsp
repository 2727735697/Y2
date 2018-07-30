<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/30
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script src="${ctx}/static/js/jquery.js" type="text/javascript"></script>
    <title>热点新闻</title>
</head>
<body>
<div>
    <h2>电子文档列表</h2>
    <table>
        <thead>
        <tr>
            <th>文档编号</th>
            <th>文档名称</th>
            <th>文档摘要</th>
            <th>上传人</th>
            <th>上传时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${page.list}" var="obj">
            <tr>
                <td>${obj.id}</td>
                <td>${obj.title}</td>
                <td>${obj.summary}</td>
                <td>${obj.uploaduser}</td>
                <td><fmt:formatDate value="${obj.createdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                <td>
                    <a href="">修改</a>
                    <a href="javascript:void(0);" data-for="delete" data="${obj.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6">
                <a href="${ctx}/category/page/1/${categoryId}">首页</a>
                <a href="${ctx}/category/page/${page.prePage}/${categoryId}">上一页</a>
                <a href="${ctx}/category/page/${page.nextPage}/${categoryId}">下一页</a>
                <a href="${ctx}/category/page/${page.pages}/${categoryId}">尾页</a>
                第${page.pageNum}页共${page.pages} 页
            </td>
        </tr>
        </tbody>
    </table>
</div>

<script>
    $(function () {
        $('#select').click(function () {
            // 获取当前的这个select里面的值，categoryId
            var cid = $('#categorySelect').val();

            window.location = '${ctx}/category/page/1/'+cid;
        })
        // 绑定删除事件
        $('a[data-for=delete]').click(function () {
            var entryId = $(this).attr("data")
            var that = this;
            $.ajax({
                url:'${ctx}/entry/delete/'+entryId,
                type:'post',
                success:function (data) {
                    if(data.msg == 'suc'){
                        window.location.reload();
                    } else {
                        alert("删除失败");
                    }
                }
            })
        })
    })
</script>
</body>
</html>
