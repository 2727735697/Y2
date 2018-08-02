
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <script src="${ctx}/static/js/jquery.js" type="text/javascript"></script>
    <title>首页</title>
</head>
<body>
<div>

    <span>新闻标题：</span><input type="text" name="title"> <button>查询</button>

    <h2>新闻列表</h2>
    <table>
        <thead>
        <tr>
            <th>新闻编号</th>
            <th>新闻标题</th>
            <th>新闻摘要</th>
            <th>作者名称</th>
            <th>创建时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${details}" var="obj">
            <tr>
                <td>${obj.id}</td>
                <td>${obj.title}</td>
                <td>${obj.summary}</td>
                <td>${obj.author}</td>
                <td><fmt:formatDate value="${obj.createdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                <td>
                    <a href="">查看评论</a>
                    <a href="">评论</a>
                    <a href="javascript:void(0);" id="delete" data="${obj.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script>
    $(function () {
        $('#delete').click(function () {
            var entryId = $(this).attr("data");
            alert(entryId);
            $.ajax({
                url:'${ctx}/detail/delete/'+entryId,
                type:'post',
                success:function (data) {
                    if(data.msg == 'suc'){
                        //前端页面删除
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